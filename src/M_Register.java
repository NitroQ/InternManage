import java.util.ArrayList;

public class M_Register {
	private String Fname, Sname, CouDept, Sect, StudID, Email, Pass, RepPass;
	
	public void getData(ArrayList<String> data) {
		Fname = data.get(0);
		Sname = data.get(1);
		CouDept = data.get(2);
		Sect = data.get(3);
		StudID = data.get(4);
		Email= data.get(5);
		Pass = data.get(6);
		RepPass = data.get(6);
	}
	public String getFname() {
		return Fname;
	}
	public String getSname() {
		return Sname;
	}
	public String getCouDept() {
		return CouDept;
	}
	public String getSect() {
		return Sect;
	}
	public String getStudID() {
		return StudID;
	}
	public String getEmail() {
		return Email;
	}
	public String getPass() {
		return Pass;
	}
	public String getRepPass() {
		return RepPass;
	}
	
}
