
public class M_ManageStu {
	 Object[] data;
	 String[] eval;
	 String name, StudID, teach, valDate;
	 int Time= 0;
	public M_ManageStu(String name, String StudID, String teach) {
		this.name = name;
		this.StudID = StudID;
		this.teach = teach;
	}
	public void setData(String date, String TimeIn, String TimeOut, String Total, String Proof, String Validate) {
		 Object[] data = {date, TimeIn, TimeOut, Total, Proof, Validate};
		 this.data = data;
	}
	public void setEval(String Q1, String Q2, String Q3, String Q4) {
		String[] eval = {Q1, Q2, Q3, Q4};
		this.eval = eval;
	}
	public void setValDate(String date) {
		this.valDate = date;
	}
	public void resetTime() {
		Time = 0;
	}
	public void setTime(int Time) {
		this.Time += Time;
	}
	public Object[] getData() {
		return data;
	}
	public String[] getEval() {
		return eval;
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
	public int getTime() {
		return Time;
	}
}


