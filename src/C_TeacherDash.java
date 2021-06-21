import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;


public class C_TeacherDash extends SQLConnect{
	V_TeacherDash td;
	M_TeacherDash md;
	
	
	public C_TeacherDash(V_TeacherDash td, M_TeacherDash md) {
		this.td =td; 
		this.md = md;
		td.frame.setVisible(true);
		td.editName(md.getName());
		getClassList();
		
		
		td.TableSelected(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V_ManageStu vr = new V_ManageStu();
				M_ManageStu mr = new M_ManageStu(td.getSelectedName(),td.getSelectedStudID(), md.getName());
				 @SuppressWarnings("unused")
				C_ManageStu cr = new C_ManageStu(vr, mr);
				td.frame.dispose();
			}
		});
		td.refreshData(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				td.resetTable();
				getClassList();
				td.refreshPane();
			}
		});
		td.logoutbutton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				V_Login vr = new V_Login();
		        M_Login mr = new M_Login();
		        @SuppressWarnings("unused")
		        C_Login cr = new C_Login(vr, mr);
		        td.frame.dispose();
			}
			
		});
		
	}
	public void getClassList() {
		try{
				con = DriverManager.getConnection(connect,"root","");
                   st = con.createStatement();
                   String query1 = "SELECT * FROM `logincredentials`";
                   rs = st.executeQuery(query1);
               while(rs.next()){
            	   if(rs.getString("Type").equals("Student")) {
                   String Name = rs.getString("Surname") + ", " + rs.getString("First");
                   String Course = rs.getString("Course/Department");
                   String Date = rs.getString("Stud_ID");
                   md.setData(Name, Course, Date);
                   td.addObject(md.getData());
            	   }
               }
          }catch(SQLException ex){
              td.Exception(ex);
          }
	}
}
