
public class M_StudentDash {
	String Name, StudID;
	int Time= 0;
	public M_StudentDash(String Name, String StudID) {
		this.Name = Name;
		this.StudID = StudID;
		
	}
	public void setTime(int Time) {
		this.Time += Time;
	}
	public void resetTime(int Time) {
		this.Time = Time;
	}
	public String getName() {
		return Name;
	}
	public String getStudID() {
		return StudID;
	}
	public int getTime() {
		return Time;
	}
}
