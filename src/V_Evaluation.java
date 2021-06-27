import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class V_Evaluation {

	JFrame frame;
	private JButton finishbtn;
	private final ButtonGroup buttonGroupNo1 = new ButtonGroup();
	private final ButtonGroup buttonGroupNo2 = new ButtonGroup();
	private final ButtonGroup buttonGroupNo3 = new ButtonGroup();
	private final ButtonGroup buttonGroupNo4 = new ButtonGroup();
	private JLabel ID;
	
	public V_Evaluation() {
		initialize();
	}
	public void Exception(Object ex) {
		JOptionPane.showMessageDialog(null, ex );
	}
	void noAnswer() {
		JOptionPane.showMessageDialog(null,"All Questions Should be Answered.");
	}
	void successEval() {
		JOptionPane.showMessageDialog(null,"Evaluated!");
	}
	void finishButton(ActionListener fn) {
		finishbtn.addActionListener(fn);
	}
	void setID(String StudID) {
		ID.setText(StudID);
	}
	public ButtonGroup getAnswer1() {
		return buttonGroupNo1;
	}
	public ButtonGroup getAnswer2() {
		return buttonGroupNo2;
	}
	public ButtonGroup getAnswer3() {
		return buttonGroupNo3;
	}
	public ButtonGroup getAnswer4() {
		return buttonGroupNo4;
	}
	
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension (995, 595);
        
		frame = new JFrame("National-U Internship Management");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2, 995, 595);
		frame.addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        "Are you sure you want to exit the program?", "Exit Program Message Box",
			        JOptionPane.YES_NO_OPTION);

			    if (confirmed == JOptionPane.YES_OPTION) {
			      frame.dispose();
			    }
			    else {
			    	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			    }
			  }
			});
		Image icon = new ImageIcon(this.getClass().getResource("/NU.png")).getImage();
		frame.setIconImage(icon);
		
		JLabel lblNewLabel = new JLabel("Evaluation");
		lblNewLabel.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblNewLabel.setBounds(73, 63, 313, 56);
		frame.getContentPane().add(lblNewLabel);
		
		ID = new JLabel("");
		ID.setForeground(new Color(53, 64, 142));
		ID.setFont(new Font("Montserrat Black", Font.ITALIC, 21));
		ID.setBounds(73, 93, 179, 80);
		frame.getContentPane().add(ID);
		
		JLabel Criteria = new JLabel("Criteria:");
		Criteria.setFont(new Font("Montserrat Black", Font.ITALIC, 18));
		Criteria.setBounds(222, 214, 156, 23);
		frame.getContentPane().add(Criteria);
		
		JLabel first = new JLabel("Reports to Work on Time");
		first.setFont(new Font("Montserrat", Font.ITALIC, 18));
		first.setBounds(161, 235, 278, 38);
		frame.getContentPane().add(first);
		
		JLabel Seond = new JLabel("Accept Reposibility and");
		Seond.setFont(new Font("Montserrat", Font.ITALIC, 18));
		Seond.setBounds(162, 290, 253, 38);
		frame.getContentPane().add(Seond);
		
		JLabel lblAndRegularly = new JLabel("and regularly");
		lblAndRegularly.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblAndRegularly.setBounds(210, 253, 278, 38);
		frame.getContentPane().add(lblAndRegularly);
		
		JLabel lblAssignmentVolunteerism = new JLabel("Assignment Volunteerism");
		lblAssignmentVolunteerism.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblAssignmentVolunteerism.setBounds(162, 309, 278, 38);
		frame.getContentPane().add(lblAssignmentVolunteerism);
		
		JLabel lblEstablishRaportWith = new JLabel("Establish Rapport with the");
		lblEstablishRaportWith.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblEstablishRaportWith.setBounds(161, 351, 278, 38);
		frame.getContentPane().add(lblEstablishRaportWith);
		
		JLabel lblAssociatedPersonel = new JLabel("Associated Personnel ");
		lblAssociatedPersonel.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblAssociatedPersonel.setBounds(186, 371, 278, 38);
		frame.getContentPane().add(lblAssociatedPersonel);
		
		JLabel lblEstablishRaportWith_1 = new JLabel("Performs the Job without");
		lblEstablishRaportWith_1.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblEstablishRaportWith_1.setBounds(161, 410, 278, 38);
		frame.getContentPane().add(lblEstablishRaportWith_1);
		
		JLabel lblAssociatedPersonel_1 = new JLabel("needing close supervision");
		lblAssociatedPersonel_1.setFont(new Font("Montserrat", Font.ITALIC, 18));
		lblAssociatedPersonel_1.setBounds(162, 427, 278, 38);
		frame.getContentPane().add(lblAssociatedPersonel_1);
		
		JLabel lblRatingValue = new JLabel("Rating Value:");
		lblRatingValue.setForeground(Color.WHITE);
		lblRatingValue.setFont(new Font("Montserrat Black", Font.ITALIC, 18));
		lblRatingValue.setBounds(452, 84, 156, 23);
		frame.getContentPane().add(lblRatingValue);
		
		JLabel first_1 = new JLabel("5 - Outstanding; 4 - Very Satisfactory\r\n");
		first_1.setForeground(Color.WHITE);
		first_1.setFont(new Font("Montserrat", Font.ITALIC, 18));
		first_1.setBounds(462, 110, 430, 44);
		frame.getContentPane().add(first_1);
		
		JLabel first_1_1 = new JLabel("3 - Satisfactory; 2 - Unsatisfactory; 1 - Poor");
		first_1_1.setForeground(Color.WHITE);
		first_1_1.setFont(new Font("Montserrat", Font.ITALIC, 18));
		first_1_1.setBounds(462, 129, 430, 44);
		frame.getContentPane().add(first_1_1);
		
		finishbtn = new JButton("Finish");
		finishbtn.setFocusPainted(false);
		finishbtn.setForeground(Color.WHITE);
		finishbtn.setBackground(new Color(53, 64, 142));
		finishbtn.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 16));
		finishbtn.setBorder(null);
		finishbtn.setBounds(426, 495, 110, 33);
		frame.getContentPane().add(finishbtn);
		
		JLabel lblNewLabel_1 = new JLabel("5");
		lblNewLabel_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(548, 277, 15, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("4");
		lblNewLabel_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1.setBounds(613, 277, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3");
		lblNewLabel_1_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1.setBounds(680, 277, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("2");
		lblNewLabel_1_1_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1.setBounds(747, 277, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("1");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_1.setBounds(812, 277, 15, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("5");
		buttonGroupNo1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(543, 250, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("4");
		buttonGroupNo1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(609, 250, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("3");
		buttonGroupNo1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(675, 250, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("2");
		buttonGroupNo1.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(741, 250, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("1");
		buttonGroupNo1.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(807, 250, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("5");
		lblNewLabel_1_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2.setBounds(548, 339, 31, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("4");
		lblNewLabel_1_1_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_2.setBounds(613, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("3");
		lblNewLabel_1_1_1_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_2.setBounds(680, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("2");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_2.setBounds(747, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("1");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_1_1.setBounds(812, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("5");
		buttonGroupNo2.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(543, 309, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("4");
		buttonGroupNo2.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(609, 309, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("3");
		buttonGroupNo2.add(rdbtnNewRadioButton_1_1_1);
		rdbtnNewRadioButton_1_1_1.setBounds(675, 309, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2_1 = new JRadioButton("2");
		buttonGroupNo2.add(rdbtnNewRadioButton_1_2_1);
		rdbtnNewRadioButton_1_2_1.setBounds(741, 309, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_3_1 = new JRadioButton("1");
		buttonGroupNo2.add(rdbtnNewRadioButton_1_3_1);
		rdbtnNewRadioButton_1_3_1.setBounds(807, 309, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_3_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("5");
		lblNewLabel_1_3.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_3.setBounds(548, 396, 31, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("4");
		lblNewLabel_1_1_3.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_3.setBounds(613, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("3");
		lblNewLabel_1_1_1_3.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_3.setBounds(680, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("2");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_3.setBounds(747, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("1");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_1_2.setBounds(812, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("5");
		buttonGroupNo3.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(542, 366, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1_5 = new JRadioButton("4");
		buttonGroupNo3.add(rdbtnNewRadioButton_1_5);
		rdbtnNewRadioButton_1_5.setBounds(609, 366, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_5);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("3");
		buttonGroupNo3.add(rdbtnNewRadioButton_1_1_2);
		rdbtnNewRadioButton_1_1_2.setBounds(675, 366, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_2_2 = new JRadioButton("2");
		buttonGroupNo3.add(rdbtnNewRadioButton_1_2_2);
		rdbtnNewRadioButton_1_2_2.setBounds(741, 366, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2_2);
		
		JRadioButton rdbtnNewRadioButton_1_3_2 = new JRadioButton("1");
		buttonGroupNo3.add(rdbtnNewRadioButton_1_3_2);
		rdbtnNewRadioButton_1_3_2.setBounds(806, 366, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_3_2);
		
		JLabel Criteria_1 = new JLabel("Rating:");
		Criteria_1.setFont(new Font("Montserrat Black", Font.ITALIC, 18));
		Criteria_1.setBounds(656, 214, 156, 23);
		frame.getContentPane().add(Criteria_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("5");
		lblNewLabel_1_3_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_3_1.setBounds(548, 457, 31, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("4");
		lblNewLabel_1_1_3_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_3_1.setBounds(613, 457, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("3");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_3_1.setBounds(680, 457, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1_3_1 = new JLabel("2");
		lblNewLabel_1_1_1_1_3_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_3_1.setBounds(747, 457, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("1");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(812, 457, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("5");
		buttonGroupNo4.add(rdbtnNewRadioButton_3_1);
		rdbtnNewRadioButton_3_1.setBounds(542, 427, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_1_5_1 = new JRadioButton("4");
		buttonGroupNo4.add(rdbtnNewRadioButton_1_5_1);
		rdbtnNewRadioButton_1_5_1.setBounds(609, 427, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_5_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_2_1 = new JRadioButton("3");
		buttonGroupNo4.add(rdbtnNewRadioButton_1_1_2_1);
		rdbtnNewRadioButton_1_1_2_1.setBounds(675, 427, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_2_2_1 = new JRadioButton("2");
		buttonGroupNo4.add(rdbtnNewRadioButton_1_2_2_1);
		rdbtnNewRadioButton_1_2_2_1.setBounds(741, 427, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_3_2_1 = new JRadioButton("1");
		buttonGroupNo4.add(rdbtnNewRadioButton_1_3_2_1);
		rdbtnNewRadioButton_1_3_2_1.setBounds(806, 427, 21, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_3_2_1);
		
		JLabel backgroundimg = new JLabel("");
		backgroundimg.setBounds(0, 0, 989, 566);
		Image img = new ImageIcon(this.getClass().getResource("/Evaluation.png")).getImage();
		backgroundimg.setIcon(new ImageIcon(img));
		frame.getContentPane().add(backgroundimg);
		
		
	}
}
