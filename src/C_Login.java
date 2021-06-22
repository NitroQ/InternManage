import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class C_Login extends SQLConnect{
	V_Login vl;
	M_Login ml;
	
	
	public C_Login(V_Login vl, M_Login ml) {
		this.vl = vl;
		this.ml = ml;
		
		vl.frame.setVisible(true);
		vl.LoginListener(new LoginListener());
		vl.Signupredirect(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_Register vr = new V_Register();
				M_Register mr = new M_Register();
				 @SuppressWarnings("unused")
				C_Register cr = new C_Register(vr, mr);
				vl.frame.dispose();
			}
		});
		vl.ForgotPass(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				forgotPass();
			}
		});
		
	}
	private void fetchDatabase() {
        try {
        	String query1 = "SELECT * FROM `logincredentials` WHERE `Email` = ? AND `Password` = ?";
           con = DriverManager.getConnection(connect,"root","");
           ps = con.prepareStatement(query1);
           ps.setString(1, ml.getEmail());
           ps.setString(2, ml.getPass());
           rs = ps.executeQuery();
            while(rs.next()){
             ml.setFemail(rs.getString("Email"));
             ml.setFpass(rs.getString("Password"));
             ml.setType(rs.getString("Type"));
             ml.setStudID(rs.getString("Stud_ID"));
             ml.setName(rs.getString("First"));
            }
            
        } catch (Exception ex) {
            vl.Exception(ex);
         }
	}
	private boolean checkInfo() {
		if(ml.getPass().equals(ml.getFpass()) && ml.getEmail().equals(ml.getFemail())) {
			return true;
		}else {
			return false;
		}
	}
	private void forgotPass() {
		  String mail = vl.forgotEmail();
		  if (FindEmail(mail)) {
		        String verification = forgotMail(mail);
		        String code = vl.forgotCode();
		        	if(verification.equals(code)) {
		        		String newpass = vl.forgotNewPass();
		        		String repnewpass = vl.forgotRepPass();
		        			if(newpass.equals(repnewpass)) {
		        				ChangePass(mail, newpass);
		        				vl.forgotChanged();
		        			}else {
		        				vl.forgotnotMatch();
		        			}
		        	}
		        }else {
		        	vl.forgotnotFound();
		        }
	}
	private boolean FindEmail(String mail) {
		   try {
	        	String query1 = "SELECT * FROM `logincredentials` WHERE `Email` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, mail);
	           rs = ps.executeQuery();
	            while(rs.next()){
	             ml.setforgotEmail(rs.getString("Email"));
	            }
	            
	        } catch (Exception ex) {
	            vl.Exception(ex);
	         }
		   if(ml.getFgmail() != null) {
			   if(ml.getFgmail().equals(mail)) {
				   return true;
			   }else {
				   return false;
			   }
		   }else {
			   return false;
		   }
	}
	private void ChangePass(String mail, String pass) {
		   try {
	        	String query1 = "UPDATE `logincredentials` SET `Password`= ? WHERE `Email` = ?";
	           con = DriverManager.getConnection(connect,"root","");
	           ps = con.prepareStatement(query1);
	           ps.setString(1, pass);
	           ps.setString(2, mail);
	           ps.executeUpdate();
	            
	        } catch (Exception ex) {
	            vl.Exception(ex);
	         }
	}
	private String forgotMail(String email) {
		
		  final String user="rdmailtolores@gmail.com";
		  final String password="CH53s^XfA6op%c#J7u8hf%j";
		  
		  String to= email;
		  
		  Random r = new Random();
	      String rand = String.valueOf(r.nextInt((90000 - 10000) + 1) + 0);
	      
		   Properties props = new Properties();  
		   props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "465");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.socketFactory.port", "465");
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("Forgot Password");  
		     message.setText("Your Recovery Code is: " + rand);  
		       
		     Transport.send(message);  
		   
		     } catch (MessagingException e) {
		    	vl.Exception(e);
		    	 }  
	
		    return rand;
	}
	class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(vl.getEmail().equals(null)|| vl.getEmail().equals("") &&
               vl.getPass().equals(null)|| vl.getPass().equals("")) {
				vl.InvalidInput();
			}else {
				ml.setEmail(vl.getEmail());
				ml.setPass(vl.getPass());
				fetchDatabase();
				if(checkInfo()) {
					if(ml.getType().equals("Teacher")) {
						V_TeacherDash vtd = new V_TeacherDash();
						M_TeacherDash mtd = new M_TeacherDash(ml.getName());
						 @SuppressWarnings("unused")
						C_TeacherDash ctd = new C_TeacherDash(vtd, mtd);	
						vl.frame.dispose();
					}else {
						V_StudentDash vs = new V_StudentDash();
						M_StudentDash ms = new M_StudentDash(ml.getName(), ml.getStudID());
						 @SuppressWarnings("unused")
						C_StudentDash cs = new C_StudentDash(vs,ms);
						vl.frame.dispose();
					}
				}else {
					vl.InvalidRep();
				}
				
			}
			
		}
		
	}
	
}

