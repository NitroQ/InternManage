import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class C_Evaluation extends SQLConnect {
	V_Evaluation cl;
	M_Evaluation ml;
	public C_Evaluation(V_Evaluation cl, M_Evaluation ml) {
		this.cl = cl;
		this.ml = ml;
		cl.setID(ml.getStudID());
		cl.frame.setVisible(true);
		cl.finishButton(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkAnswers();
				cl.frame.dispose();
			}
			
		});
	}
	public void checkAnswers() {
		ml.setAnswers(getSelAns(cl.getAnswer1()),getSelAns(cl.getAnswer2()),getSelAns(cl.getAnswer3()), getSelAns(cl.getAnswer4()));
	
		if(ml.getAnswer1() == null || ml.getAnswer2() == null || ml.getAnswer3() == null || ml.getAnswer4() == null ) {
			cl.noAnswer();
		}else {
			fetchAns();
			cl.successEval();
		}
	}
	public void fetchAns() {
		try{
			String query = "INSERT INTO `eval`(`StudID`, `Q1`, `Q2`, `Q3`, `Q4`) VALUES (?,?,?,?,?)";
		    con = DriverManager.getConnection(connect,"root","");
		    ps = con.prepareStatement(query);
             ps.setString(1, ml.getStudID());
             ps.setString(2, ml.getAnswer1());
             ps.setString(3, ml.getAnswer2());
             ps.setString(4, ml.getAnswer3());
             ps.setString(5, ml.getAnswer4());
             ps.executeUpdate();
                
    	 }catch(HeadlessException | SQLException ex){
             cl.Exception(ex);
    	 }
	}
	public static String getSelAns(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
}
