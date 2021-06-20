
public class M_DTR {
	String StudID, date, timein, timeout, Name, doc;
	public M_DTR(String Name, String StudID) {
		this.StudID = StudID;
		this.Name = Name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTimeIn(String timein) {
		this.timein = timein;
	}
	public void setTimeOut(String timeout) {
		this.timeout = timeout;
	}
	public void setDocu(String doc) {
		this.doc = doc;
	}
	public String getStudID() {
		return StudID;
	}
	public String getDate() {
		return date;
	}
	public String getTimeOut() {
		return timeout;
	}
	public String getName() {
		return Name;
	}
	public String getTimeIn() {
		return timein;
	}
	public String getDocu() {
		return doc;
	}
}
