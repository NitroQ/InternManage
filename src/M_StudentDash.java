
public class M_StudentDash {
	String Name, StudID;
	int hours= 0;
	public M_StudentDash(String Name, String StudID) {
		this.Name = Name;
		this.StudID = StudID;
		
	}
	public void setHour(int hour) {
		this.hours += hour;
	}
	public void resetHour(int hour) {
		this.hours = hour;
	}
	public String getName() {
		return Name;
	}
	public String getStudID() {
		return StudID;
	}
	public String getHours() {
		String hr = String.valueOf(hours);
		return hr;
	}
}
