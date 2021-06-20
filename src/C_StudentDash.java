
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

import javax.swing.JOptionPane;


public class C_StudentDash {

	V_StudentDash vsd;
	M_StudentDash msd;
	private String connect = "jdbc:mysql://localhost:3306/internmanage?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static Connection con = null;
	static PreparedStatement ps = null;
	static  Statement st = null;
	static ResultSet rs = null;
	
	public  C_StudentDash(V_StudentDash vs,M_StudentDash ms) {
		this.vsd = vs;
		this.msd = ms;
		vsd.setwelcome(msd.getName());
		getStudentTime();
		vsd.frame.setVisible(true);
		
		vsd.openDTR(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				vsd.frame.dispose();
				V_DTR mv = new V_DTR();
				M_DTR md = new M_DTR(msd.getName(),msd.getStudID());
				C_DTR cr = new C_DTR(mv, md);
			}
		});
		vsd.logoutbutton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				V_Login vr = new V_Login();
		        M_Login mr = new M_Login();
		        C_Login cr = new C_Login(vr, mr);
		        vsd.frame.dispose();
			}
			
		});
		vsd.refreshbutton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getStudentTime();
				vsd.refreshPane();
			}
			
		});
	}
	public void getStudentTime() {
		 try {
	        	String query1 = "SELECT * FROM `dtr` WHERE `StudID` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, msd.getStudID());
	           rs = ps.executeQuery();
	            while(rs.next()){
	            		try {
	            			msd.setHour(Integer.parseInt(rs.getString("Total").trim()));
	            		}catch(NumberFormatException ex) {}
	            	}
	        } catch (Exception ex) {
	            vsd.Exception(ex);
	         }
		 if(msd.getHours() != null || !msd.getHours().equals("")) {
         	vsd.setHours(msd.getHours());
     	}
	}
	
}
