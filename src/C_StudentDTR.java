import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class C_StudentDTR extends SQLConnect implements StudentData{
	V_StudentDTR sdv;
	M_StudentDTR sdm;
	
		public C_StudentDTR(V_StudentDTR sdv, M_StudentDTR sdm) {
			this.sdv = sdv;
			this.sdm = sdm;
			
			sdv.setIDStu(sdm.getStudID());
			getStudentData();
			sdv.backbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					V_StudentDash vs = new V_StudentDash();
					M_StudentDash ms = new M_StudentDash(sdm.getName(), sdm.getStudID());
					 @SuppressWarnings("unused")
					C_StudentDash cs = new C_StudentDash(vs,ms);
					sdv.frame.dispose();
					
				}
			});
			sdv.refreshbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					sdv.resetTable();
					getStudentData();
					sdv.refreshPane();
				}
			});
			
		}
	
		@Override
		public void getStudentData() {
			try{
				  String query1 = "SELECT * FROM `dtr`";
					con = DriverManager.getConnection(connect,"root","");
	                   st = con.createStatement();
	                   rs = st.executeQuery(query1);
	               while(rs.next()){
	            	   if(rs.getString("StudID").equals(sdm.getStudID())) {
	            		   String date = rs.getString("Date");
	            		   String timein = rs.getString("TimeIn");
	            		   String timeout = rs.getString("TimeOut");
	            		   String total = rs.getString("Total");
	            		   String proof = rs.getString("Proof");
	            		   sdm.setData(date,timein, timeout,total,proof);
	            		   sdv.addObject(sdm.getData());
	            	   }
	               }
	          }catch(SQLException ex){
	              sdv.Exception(ex);
	          }
			
		}
}

