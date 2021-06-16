
public class M_Login {
	private String Email, Pass, fetchedEmail, fetchedPass, Type;
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
}
