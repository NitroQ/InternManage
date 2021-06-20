
public class M_TeacherDash {
	 private Object[]data;	 
	 private String Name;
	 public M_TeacherDash(String Name) {
		 this.Name = Name;
	 }
	 public void setData(String Name, String CouDept, String StudID) {
		 Object[] data = {Name, CouDept, StudID};
		 this.data = data;
	 }
	 public String getName() {
		 return Name;
	 }
	 public Object[] getData(){
		 return data;
	 }
	 
}
