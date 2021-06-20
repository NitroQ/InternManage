
public class M_Login {
	private String Email, Pass, fetchedEmail, fetchedPass, Type, StudID,Name, fgmail;
	public void setFemail(String fmail) {
		this.fetchedEmail = fmail;
	}
	public void setFpass(String fpass) {
		this.fetchedPass = fpass;
	}
	public void setType(String Type) {
		this.Type = Type;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public void setPass(String Pass) {
		this.Pass = Pass;
	}
	public void setStudID (String StudID) {
		this.StudID = StudID;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setforgotEmail(String fgmail) {
		this.fgmail = fgmail;
	}
	public String getFemail() {
		return fetchedEmail;
	}
	public String getFpass() {
		return fetchedPass;
	}
	public String getEmail() {
		return Email;
	}
	public String getPass() {
		return Pass;
	}
	public String getType() {
		return Type;
	}
	public String getStudID() {
		return StudID;
	}
	public String getName() {
		return Name;
	}
	public String getFgmail() {
		return fgmail;
	}
}
