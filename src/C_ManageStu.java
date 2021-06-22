import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class C_ManageStu extends SQLConnect{
	V_ManageStu mv;
	M_ManageStu mm;
	
		public C_ManageStu(V_ManageStu mv, M_ManageStu mm) {
			this.mv = mv;
			this.mm = mm;
			
			mv.setNameStu(mm.getStudID(), mm.getName());
			getStudData();
			mv.backbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					V_TeacherDash vtd = new V_TeacherDash();
					M_TeacherDash mtd = new M_TeacherDash(mm.getTeach());
					 @SuppressWarnings("unused")
					C_TeacherDash ctd = new C_TeacherDash(vtd,mtd);	
					mv.frame.dispose();
					
				}

			});
			mv.refreshbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mv.resetTable();
					getStudData();
					mv.refreshPane();
				}
			});
			mv.validatebutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(mv.getDate().equals("")) {
						mv.noSelected();
					}else {
						mm.setValDate(mv.getDate());
						validate();
						mv.resetTable();
						getStudData();
					}
				}
				
			});
		}
		private void validate() {
			try {
	        	String query1 = "UPDATE `dtr` SET `Validate`= ? WHERE `Date` = ? AND `StudID` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, "Validated");
	           ps.setString(2, mm.getValDate());
	           ps.setString(3, mm.getStudID());
	           ps.executeUpdate();
	        } catch (Exception ex) {
	            mv.Exception(ex);
	         }
		}
		private void getStudData() {
			try{
				  String query1 = "SELECT * FROM `dtr`";
					con = DriverManager.getConnection(connect,"root","");
	                   st = con.createStatement();
	                   rs = st.executeQuery(query1);
	               while(rs.next()){
	            	   if(rs.getString("StudID").equals(mm.getStudID())) {
	            		   String date = rs.getString("Date");
	            		   String timein = rs.getString("TimeIn");
	            		   String timeout = rs.getString("TimeOut");
	            		   String total = rs.getString("Total");
	            		   String proof = rs.getString("Proof");
	            		   String validate = rs.getString("Validate");
	            		   mm.setData(date,timein, timeout,total,proof,validate);
	            		   mv.addObject(mm.getData());
	            	   }
	               }
	          }catch(SQLException ex){
	              mv.Exception(ex);
	          }
		}
}

