import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;

import javax.swing.JOptionPane;
public class C_Login {
	V_Login vl;
	M_Login ml;
	
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static  Statement st = null;
	
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
				C_Register cr = new C_Register(vr, mr);
				vl.frame.dispose();
			}
		});
		
	}
	private void fetchDatabase() {
        try {
        	String query1 = "SELECT * FROM `logincredentials` WHERE `Email` = ? AND `Password` = ?";
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internmanage?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
           ps = con.prepareStatement(query1);
           ps.setString(1, ml.getEmail());
           ps.setString(2, ml.getPass());
           rs = ps.executeQuery();
            while(rs.next()){
             ml.setFemail(rs.getString("Email"));
             ml.setFpass(rs.getString("Password"));
             ml.setType(rs.getString("Type"));
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
						C_TeacherDash ctd = new C_TeacherDash(vtd);	
						vl.frame.dispose();
					}else {
						V_StudentDash vs = new V_StudentDash();
						C_StudentDash cs = new C_StudentDash(vs);
						vl.frame.dispose();
					}
				}else {
					vl.InvalidRep();
				}
				
			}
			
		}
		
	}
	
}

