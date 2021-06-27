
public class M_Evaluation {
	String StudID, Answer1, Answer2, Answer3, Answer4;

	public M_Evaluation(String StudID) {
		this.StudID = StudID;
	}
	public void setAnswers(String Answer1,String Answer2,String Answer3,String Answer4) {
		this.Answer1 = Answer1;
		this.Answer2 = Answer2;
		this.Answer3 = Answer3;
		this.Answer4 = Answer4;
	}
	public String getStudID() {
		return StudID;
	}
	public String getAnswer1() {
		return Answer1;
	}
	public String getAnswer2() {
		return Answer2;
	}
	public String getAnswer3() {
		return Answer3;
	}
	public String getAnswer4() {
		return Answer4;
	}
	
}
