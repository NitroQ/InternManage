import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class C_ManageStu extends SQLConnect implements StudentData{
	V_ManageStu mv;
	M_ManageStu mm;
	
		public C_ManageStu(V_ManageStu mv, M_ManageStu mm) {
			this.mv = mv;
			this.mm = mm;
			
			mv.setNameStu(mm.getStudID(), mm.getName());
			getStudentData(); getEval();
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
					getStudentData();
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
						validate("Approved");
						mv.resetTable();
						getStudentData();
					}
				}
			});
			mv.chktime(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String tc = calc();
					mv.time(tc);
				}
			});
			mv.evalbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mv.evalData(mm.getEval());
				}
				
			});
			mv.invalidbutton(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(mv.getDate().equals("")) {
						mv.noSelected();
					}else {
						mm.setValDate(mv.getDate());
						validate("Rejected");
						mv.resetTable();
						getStudentData();
					}
				}
			});
			
		}
		private void validate(String val) {
			try {
	        	String query1 = "UPDATE `dtr` SET `Remarks` = ? WHERE `Date` = ? AND `StudID` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, val);
	           ps.setString(2, mm.getValDate());
	           ps.setString(3, mm.getStudID());
	           ps.executeUpdate();
	        } catch (Exception ex) {
	            mv.Exception(ex);
	         }
		}
		private void getEval() {
			try {
	        	String query1 = "SELECT * FROM `eval` WHERE `StudID` = ? ";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, mm.getStudID());
	           rs = ps.executeQuery();
	            while(rs.next()){
	            	if(rs.getString("StudID").equals(mm.getStudID())) {
	            		mv.evalButtonAv();
	            		String Q1 = rs.getString("Q1");
	            		String Q2 = rs.getString("Q2");
	            		String Q3 = rs.getString("Q3");
	            		String Q4 = rs.getString("Q4");
	            		mm.setEval(Q1, Q2, Q3, Q4);
	            	}
	            	}
	        } catch (Exception ex) {
	            mv.Exception(ex);
	         }
			
			
		}
		public String calc(){
				try {
		        	String query1 = "SELECT * FROM `dtr` WHERE `StudID` = ? ";
		           con = DriverManager.getConnection(connect,"root","");
		           ps = con.prepareStatement(query1);
		           ps.setString(1, mm.getStudID());
		           rs = ps.executeQuery();
		            while(rs.next()){
		            	if(!rs.getString("Remarks").equals("Rejected")) {
		            		try {
		            			mm.setTime(Integer.parseInt(rs.getString("Total").trim()));
		            		}catch(NumberFormatException ex) {}
		            	}	
		            	}
		        } catch (Exception ex) {
		            mv.Exception(ex);
		        }   
				String time = String.valueOf(mm.getTime());
				return time;
		}
		@Override
		public void getStudentData() {
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
	            		   String validate = rs.getString("Remarks");
	            		   mm.setData(date,timein, timeout,total,proof,validate);
	            		   mv.addObject(mm.getData());
	            	   }
	               }
	          }catch(SQLException ex){
	              mv.Exception(ex);
	          }
			
		}
}

