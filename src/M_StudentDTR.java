public class M_StudentDTR{
	 Object[] data;
	 String StudID, Name;
	public M_StudentDTR(String StudID, String Name) {
		this.StudID = StudID;
		this.Name = Name;
	}
	public void setData(String date, String TimeIn, String TimeOut, String Total, String Proof) {
		 Object[] data = {date, TimeIn, TimeOut, Total, Proof};
		 this.data = data;
	}
	public Object[] getData() {
		return data;
	}
	
	public String getStudID() {
		return StudID;
	}
	public String getName() {
		return Name;
	}
	
	
}