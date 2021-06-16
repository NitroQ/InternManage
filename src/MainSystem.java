
public class MainSystem {
	public static void main(String[] args) {
		V_Login vr = new V_Login();
		M_Login mr = new M_Login();
		C_Login cr = new C_Login(vr, mr);
	}

}
