
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StudentOJT {
	

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_3, lblNewLabel_3_1,  lblNewLabel_3_2,  lblNewLabel_4, lblNewLabel_2,lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_2_1;
	private JRadioButton RadStudent, RadTeacher;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentOJT window = new StudentOJT();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentOJT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension (995, 595);
		
		frame = new JFrame("National-U Internship Management");
		frame.setResizable(false);
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = new ImageIcon(this.getClass().getResource("/NU.png")).getImage();
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		
		RadStudent = new JRadioButton("Student");
		RadStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RadStudent.isSelected()) {
					lblNewLabel_2.setText("Student Personal Details");
					lblNewLabel_3_1.setText("COURSE");
					lblNewLabel_3_2.setVisible(true);
					lblNewLabel_4.setVisible(true);
					lblNewLabel_2.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
					lblNewLabel_2_1.setBounds(70, 328, 273, 25);
					lblNewLabel_5.setBounds(70, 361, 158, 25);
					textField_4.setBounds(70, 385, 262, 29);
					lblNewLabel_6.setBounds(342, 361, 110, 25);
					textField_5.setBounds(342, 385, 239, 29);
					lblNewLabel_7.setBounds(591, 361, 210, 25);
					textField_6.setBounds(591, 385, 239, 29);
					chckbxNewCheckBox.setBounds(70, 433, 165, 23);
					lblNewLabel_8.setBounds(241, 432, 170, 25);
					btnNewButton.setBounds(70, 475, 110, 43);
				}
			}
		});
		RadStudent.setSelected(true);
		buttonGroup.add(RadStudent);
		RadStudent.setFont(new Font("Montserrat", Font.ITALIC, 20));
		RadStudent.setBounds(194, 109, 109, 23);
		frame.getContentPane().add(RadStudent);
		
		RadTeacher = new JRadioButton("Teacher");
		RadTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RadTeacher.isSelected()) {
					lblNewLabel_2.setText("Teacher Personal Details");
					lblNewLabel_3_1.setText("DEPARTMENT");
					lblNewLabel_3_2.setVisible(false);
					lblNewLabel_4.setVisible(false);
					textField_2.setVisible(false);
					textField_3.setVisible(false);
					
					lblNewLabel_2_1.setBounds(70, 253, 273, 25);
					lblNewLabel_5.setBounds(70, 286, 158, 25);
					textField_4.setBounds(70, 310, 262, 29);
					lblNewLabel_6.setBounds(342, 286, 110, 25);
					textField_5.setBounds(342, 310, 239, 29);
					lblNewLabel_7.setBounds(591, 286, 210, 25);
					textField_6.setBounds(591, 310, 239, 29);
					chckbxNewCheckBox.setBounds(70, 358, 165, 23);
					lblNewLabel_8.setBounds(241, 357, 170, 25);
					btnNewButton.setBounds(70, 400, 110, 43);
					
				}
			}
		});
		buttonGroup.add(RadTeacher);
		RadTeacher.setFont(new Font("Montserrat", Font.ITALIC, 20));
		RadTeacher.setBounds(320, 109, 109, 23);
		frame.getContentPane().add(RadTeacher);
		
		lblNewLabel_3 = new JLabel("FULL NAME");
		lblNewLabel_3.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3.setBounds(70, 188, 120, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(70, 213, 329, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_3_1 = new JLabel("COURSE");
		lblNewLabel_3_1.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(436, 188, 120, 25);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(436, 213, 406, 29);
		frame.getContentPane().add(textField_1);
		
	
		lblNewLabel_3_2 = new JLabel("SECTION");
		lblNewLabel_3_2.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(70, 253, 120, 25);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		textField_2 = new JTextField();
		textField_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(70, 278, 237, 29);
		frame.getContentPane().add(textField_2);
		
		lblNewLabel_4 = new JLabel("STUDENT ID");
		lblNewLabel_4.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_4.setBounds(331, 253, 110, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(331, 278, 234, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		lblNewLabel_5 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_5.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_5.setBounds(70, 361, 158, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(70, 385, 262, 29);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("PASSWORD");
		lblNewLabel_6.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_6.setBounds(342, 361, 110, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(342, 385, 239, 29);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_7.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_7.setBounds(591, 361, 210, 25);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(591, 385, 239, 29);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("I have agreed to the");
		chckbxNewCheckBox.setFont(new Font("Montserrat", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(70, 433, 165, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		lblNewLabel_8 = new JLabel("<HTML><U>Terms and Conditions.</U></HTML>");
		lblNewLabel_8.setForeground(new Color(53,79,142));
		lblNewLabel_8.setFont(new Font("Montserrat ExtraBold", Font.ITALIC, 14));
		lblNewLabel_8.setBounds(241, 432, 170, 25);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_2_1 = new JLabel("Account Details");
		lblNewLabel_2_1.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(70, 328, 273, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("Sign-up an Account");
		lblNewLabel.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblNewLabel.setBounds(70, 41, 538, 68);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Student Personal Details");
		lblNewLabel_2.setBounds(70, 152, 382, 25);
		lblNewLabel_2.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Are you a:");
		lblNewLabel_1.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(70, 102, 147, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		btnNewButton = new JButton("Sign Up");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(53,79,142));
		btnNewButton.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnNewButton.setBounds(70, 475, 110, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton = new JButton("<HTML><U>Log In</U></HTML>");
		btnNewButton.setForeground(new Color(53, 64, 142));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Montserrat Black", Font.PLAIN, 16));
		btnNewButton.setBounds(843, 489, 111, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Already have an account?");
		lblNewLabel_7.setFont(new Font("Montserrat", Font.ITALIC, 14));
		lblNewLabel_7.setBounds(657, 497, 191, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel Background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
        Background.setIcon(new ImageIcon(img));
        Background.setBounds(0, 0, 987, 565);
		frame.getContentPane().add(Background);
		
		
	}
	
	
}
