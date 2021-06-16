import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.HeadlessException;
import java.sql.*;

public class C_Register {
	V_Register frames;
	M_Register data;
	static Connection con = null;
	static PreparedStatement ps = null;
	static  Statement st = null;
	
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
		
	}
	public void openLogin() {
		V_Login vr = new V_Login();
		M_Login mr = new M_Login();
		C_Login cr = new C_Login(vr, mr);
		frames.frame.dispose();
	}
	
	public void SignUpStudent() {
		try{
			String query = "INSERT INTO `logincredentials`(`First`, `Surname`, `Course/Department`, `Section`, `Stud_ID`, `Email`, `Password`, `Type`) VALUES (?,?,?,?,?,?,?,?)";
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internmanage?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		    ps = con.prepareStatement(query);
             String type = "Student";
             ps.setString(1, data.getFname());
             ps.setString(2, data.getSname());
             ps.setString(3, data.getCouDept());
             ps.setString(4, data.getSect());
             ps.setString(5, data.getStudID());
             ps.setString(6, data.getEmail());
             ps.setString(7, data.getPass());
             ps.setString(8, type);
   
                ps.executeUpdate();
                
    	 }catch(HeadlessException | SQLException ex){
             frames.Exception(ex);
         }
	}
	public void SignUpTeacher() {
		try{
			String query = "INSERT INTO `logincredentials`(`First`, `Surname`, `Course/Department`, `Section`, `Stud_ID`, `Email`, `Password`, `Type`) VALUES (?,?,?,?,?,?,?,?)";
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internmanage?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		    ps = con.prepareStatement(query);
             String type = "Teacher";
             ps.setString(1, data.getFname());
             ps.setString(2, data.getSname());
             ps.setString(3, data.getCouDept());
             ps.setString(4, "");
             ps.setString(5, "");
             ps.setString(6, data.getEmail());
             ps.setString(7, data.getPass());
             ps.setString(8, type);
   
                ps.executeUpdate();
                
    	 }catch(HeadlessException | SQLException ex){
             frames.Exception(ex);
         }
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
				}else {
					SignUpStudent();
					frames.RegisterSuccess();
					openLogin();
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
					}else {
						SignUpTeacher();
						frames.RegisterSuccess();
						openLogin();
					}
				
			}
			
		}
	
	
	}

	
}
