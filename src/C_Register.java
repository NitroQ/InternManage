import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_Register extends SQLConnect{
	V_Register frames;
	M_Register data;
	
	public  C_Register(V_Register frames, M_Register data) {
		this.frames = frames;
		this.data = data;
		
		frames.frame.setVisible(true);
		frames.SignUpListener(new SignUpListener());
		frames.Loginredirect(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openLogin();
			}
		});
		frames.termsandcon(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage();
			}
		});
	}
	
	private void openLogin() {
		V_Login vr = new V_Login();
		M_Login mr = new M_Login();
		 @SuppressWarnings("unused")
		C_Login cr = new C_Login(vr, mr);
		frames.frame.dispose();
	}
	
	public void openWebPage(){
		try {         
		     java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://sites.google.com/view/internship-management/home"));
		   }
		   catch (java.io.IOException e) {
		       frames.Exception(e);
		   }
	}
	
	private void fetchData(String Fname, String Sname, String CouDept, String Sect, String StudID, String Email, String Pass, String Type) {
		try{
			String query = "INSERT INTO `logincredentials`(`First`, `Surname`, `Course/Department`, `Section`, `Stud_ID`, `Email`, `Password`, `Type`) VALUES (?,?,?,?,?,?,?,?)";
		    con = DriverManager.getConnection(connect,"root","");
		    ps = con.prepareStatement(query);
             String type = "Student";
             ps.setString(1, Fname);
             ps.setString(2, Sname);
             ps.setString(3, CouDept);
             ps.setString(4, Sect);
             ps.setString(5, StudID);
             ps.setString(6, Email);
             ps.setString(7, Pass);
             ps.setString(8, type);
                ps.executeUpdate();
                
    	 }catch(HeadlessException | SQLException ex){
             frames.Exception(ex);
         }
	}
	private boolean FindID() {
		   try {
	        	String query1 = "SELECT * FROM `logincredentials` WHERE `Stud_ID` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, data.getStudID());
	           rs = ps.executeQuery();
	            while(rs.next()){
	             data.setcheck(rs.getString("Stud_ID"));
	            }
	            
	        } catch (Exception ex) {
	            frames.Exception(ex);
	         }
		   if(data.getcheck() != null) {
			   if(data.getcheck().equals(data.getStudID())) {
				   return true;
			   }else {
				   return false;
			   }
		   }else {
			   return false;
		   }
	}
	private void SignUpStudent() {
           String type = "Student";
           if(FindID()) {
        	   frames.idExists();
           }else {
        	   fetchData(data.getFname(), data.getSname(), data.getCouDept(), data.getSect(), data.getStudID(), data.getEmail(), data.getPass(), type );
        		frames.RegisterSuccess();
        		openLogin();
           }
           
           
	}
	private void SignUpTeacher() {
		  String type = "Teacher";
          fetchData(data.getFname(), data.getSname(), data.getCouDept(), "", "", data.getEmail(), data.getPass(), type );
          
	}
	class SignUpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			data.getData(frames.getInfo());
			
			if(frames.RadStudent.isSelected()) {
				if(data.getFname().equals("")|| data.getFname().equals(null) &&
					data.getSname().equals("")|| data.getSname().equals(null)&&
					data.getCouDept().equals("")|| data.getCouDept().equals(null) &&
					data.getSect().equals("")|| data.getSect().equals(null) &&
					data.getStudID().equals("")|| data.getStudID().equals(null) &&
					data.getEmail().equals("")|| data.getEmail().equals(null) &&
					data.getPass().equals("")|| data.getPass().equals(null) &&
					data.getRepPass().equals("")|| data.getRepPass().equals(null)) {
					frames.InvalidInput();
				}else if(!data.getPass().equals(data.getRepPass())){
					frames.InvalidRep();
				}else if(!frames.chckbxNewCheckBox.isSelected()) {
					frames.MustAgree();
				}else if(validateEmail()) {
					frames.InvalidEmail();
				}else {
					SignUpStudent();
				}
					
			}else if(frames.RadTeacher.isSelected()) {
				if(data.getFname().equals("")|| data.getFname().equals(null) &&
						data.getSname().equals("")|| data.getSname().equals(null)&&
						data.getCouDept().equals("")|| data.getCouDept().equals(null) &&
						data.getEmail().equals("")|| data.getEmail().equals(null) &&
						data.getPass().equals("")|| data.getPass().equals(null) &&
						data.getRepPass().equals("")|| data.getRepPass().equals(null)) {
						
						frames.InvalidInput();
					}else if(!data.getPass().equals(data.getRepPass())){
						frames.InvalidRep();
					}else if(!frames.chckbxNewCheckBox.isSelected()) {
						frames.MustAgree();
					}else if(validateEmail()) {
						frames.InvalidEmail();
					}else {
						SignUpTeacher();
						frames.RegisterSuccess();
						openLogin();
					}
				
			}
			
		}
		public boolean validateEmail() {
			String email = "^[^@\\s]+@[^@\\s\\.]+\\.[^@\\.\\s]+$";
			Pattern pattern = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(data.getEmail());
			if(!matcher.matches()) {
				return true;
			}else {
				return false;
			}
		}
	
	
	}

	
}
