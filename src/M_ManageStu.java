
public class M_ManageStu {
	 Object[] data;
	 String name, StudID, teach, valDate;
	public M_ManageStu(String name, String StudID, String teach) {
		this.name = name;
		this.StudID = StudID;
		this.teach = teach;
	}
	public void setData(String date, String TimeIn, String TimeOut, String Total, String Proof, String Validate) {
		 Object[] data = {date, TimeIn, TimeOut, Total, Proof, Validate};
		 this.data = data;
	}
	public void setValDate(String date) {
		this.valDate = date;
	}
	public Object[] getData() {
		return data;
	}

	public String getStudID() {
		return StudID;
	}
	public String getName() {
		return name;
	}
	public String getTeach() {
		return teach;
	}
	public String getValDate() {
		return valDate;
	}
}


