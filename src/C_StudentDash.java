import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class C_StudentDash extends SQLConnect implements StudentData{

	V_StudentDash vsd;
	M_StudentDash msd;
	boolean eval = false;
	public  C_StudentDash(V_StudentDash vs,M_StudentDash ms) {
		this.vsd = vs;
		this.msd = ms;
		vsd.setwelcome(msd.getName());
		getStudentData();
		vsd.frame.setVisible(true);
		
		vsd.openDTR(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				V_DTR mv = new V_DTR();
				M_DTR md = new M_DTR(msd.getName(),msd.getStudID());
				 @SuppressWarnings("unused")
				C_DTR cr = new C_DTR(mv, md);
				 vsd.frame.dispose();
			}
		});
		vsd.openRecord(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_StudentDTR sdv = new V_StudentDTR();
				M_StudentDTR sdm = new M_StudentDTR(msd.getStudID(),msd.getName());
				 @SuppressWarnings("unused")
				C_StudentDTR cdr = new C_StudentDTR(sdv, sdm);
				 vsd.frame.dispose();
			}
		});
		vsd.openEval(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				V_Evaluation vl = new V_Evaluation();
				M_Evaluation ml = new M_Evaluation(msd.getStudID());
				 @SuppressWarnings("unused")
				C_Evaluation cl = new C_Evaluation(vl, ml);
				
			}
		});
		vsd.logoutbutton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				V_Login vr = new V_Login();
		        M_Login mr = new M_Login();
		        @SuppressWarnings("unused")
				C_Login cr = new C_Login(vr, mr);
		        vsd.frame.dispose();
			}
			
		});
		vsd.refreshbutton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				msd.resetTime(0);
				getStudentData();
				vsd.refreshPane();
			}
			
		});
	
	}
	
	@Override
	public void getStudentData() {
		//calculate DTR
		try {
        	String query1 = "SELECT * FROM `dtr` WHERE `StudID` = ? ";
           con = DriverManager.getConnection(connect,"root","");
           ps = con.prepareStatement(query1);
           ps.setString(1, msd.getStudID());
           rs = ps.executeQuery();
            while(rs.next()){
            	if(!rs.getString("Remarks").equals("Rejected")) {
            		try {
            			msd.setTime(Integer.parseInt(rs.getString("Total").trim()));
            		}catch(NumberFormatException ex) {}
            	}	
            	}
        } catch (Exception ex) {
            vsd.Exception(ex);
         }
		vsd.setHours(String.valueOf(Math.round(msd.getTime()/60)));
		
		//checkEval
		try {
        	String query1 = "SELECT * FROM `eval` WHERE `StudID` = ? ";
           con = DriverManager.getConnection(connect,"root","");
           ps = con.prepareStatement(query1);
           ps.setString(1, msd.getStudID());
           rs = ps.executeQuery();
            while(rs.next()){
            	if(rs.getString("StudID").equals(msd.getStudID())) {
            		 eval = true;          
            	 }	
            	}
        } catch (Exception ex) {
            vsd.Exception(ex);
         }
		
		if(!(msd.getTime() >= 24000 && eval == false)) {
			vsd.setEvalDisabled();			
		}
     
	}
	
}
