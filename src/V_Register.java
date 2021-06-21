
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class V_Register {
	

	 JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField, textField_1,textField_2,textField_3,textField_4,textField_7;	
	private JLabel lblNewLabel_9, lblNewLabel_3, lblNewLabel_3_1,  lblNewLabel_3_2,  lblNewLabel_4, lblNewLabel_2,lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_2_1;
	private JPasswordField textField_5,textField_6;
	public JRadioButton RadStudent, RadTeacher;
	public JCheckBox chckbxNewCheckBox;
	public JButton btnNewButton, btnNewButton_1;
	

	public V_Register() {
		initialize();
	}
	
	public void Exception(Object ex) {
		JOptionPane.showMessageDialog(null, ex );
	}
	void MustAgree() {
		JOptionPane.showMessageDialog(null,"You Must Agree!");
	}
	void InvalidEmail() {
		JOptionPane.showMessageDialog(null,"Wrong Email Format!");
	}
	void InvalidInput() {
		JOptionPane.showMessageDialog(null,"One or More Fields are empty");
	}
	void InvalidRep() {
		JOptionPane.showMessageDialog(null,"Incorrect Password/Repeat Password");
	}
	void RegisterSuccess() {
		JOptionPane.showMessageDialog(null,"Registered!");
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
					lblNewLabel_2_1.setBounds(117, 328, 273, 25);
					lblNewLabel_5.setBounds(117, 361, 158, 25);
					textField_4.setBounds(117, 385, 237, 29);
					lblNewLabel_6.setBounds(367, 361, 110, 25);
					textField_5.setBounds(367, 385, 237, 29);
					lblNewLabel_7.setBounds(622, 361, 210, 25);
					textField_6.setBounds(622, 385, 237, 29);
					chckbxNewCheckBox.setBounds(117, 433, 165, 23);
					lblNewLabel_8.setBounds(288, 432, 170, 25);
					btnNewButton.setBounds(117, 475, 110, 43);
				}
			}
		});
		RadStudent.setSelected(true);
		buttonGroup.add(RadStudent);
		RadStudent.setFont(new Font("Montserrat", Font.ITALIC, 20));
		RadStudent.setBounds(241, 105, 109, 23);
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
					
					lblNewLabel_2_1.setBounds(117, 253, 273, 25);
					lblNewLabel_5.setBounds(117, 286, 158, 25);
					textField_4.setBounds(117, 310, 237, 29);
					lblNewLabel_6.setBounds(367, 286, 110, 25);
					textField_5.setBounds(367, 310, 237, 29);
					lblNewLabel_7.setBounds(622, 286, 210, 25);
					textField_6.setBounds(622, 310, 237, 29);
					chckbxNewCheckBox.setBounds(117, 358, 165, 23);
					lblNewLabel_8.setBounds(288, 357, 170, 25);
					btnNewButton.setBounds(117, 400, 110, 43);
					
				}
			}
		});
		buttonGroup.add(RadTeacher);
		RadTeacher.setFont(new Font("Montserrat", Font.ITALIC, 20));
		RadTeacher.setBounds(367, 105, 109, 23);
		frame.getContentPane().add(RadTeacher);
		
		lblNewLabel_3 = new JLabel("FIRST NAME");
		lblNewLabel_3.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3.setBounds(117, 184, 120, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(117, 209, 234, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_9 = new JLabel("SURNAME");
		lblNewLabel_9.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_9.setBounds(367, 184, 120, 25);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(367, 209, 239, 29);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_3_1 = new JLabel("COURSE");
		lblNewLabel_3_1.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(622, 184, 120, 25);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(622, 209, 239, 29);
		frame.getContentPane().add(textField_1);
		
	
		lblNewLabel_3_2 = new JLabel("SECTION");
		lblNewLabel_3_2.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(117, 249, 120, 25);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		textField_2 = new JTextField();
		textField_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(117, 274, 237, 29);
		frame.getContentPane().add(textField_2);
		
		lblNewLabel_4 = new JLabel("STUDENT ID");
		lblNewLabel_4.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_4.setBounds(367, 249, 110, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(367, 274, 239, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		lblNewLabel_5 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_5.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_5.setBounds(117, 357, 158, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(117, 381, 237, 29);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("PASSWORD");
		lblNewLabel_6.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_6.setBounds(367, 357, 110, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JPasswordField();
		textField_5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(367, 381, 237, 29);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_7.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_7.setBounds(622, 357, 210, 25);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JPasswordField();
		textField_6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(622, 381, 237, 29);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("I have agreed to the");
		chckbxNewCheckBox.setFont(new Font("Montserrat", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(117, 429, 165, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		lblNewLabel_8 = new JLabel("<HTML><U>Terms and Conditions.</U></HTML>");
		lblNewLabel_8.setForeground(new Color(53,79,142));
		lblNewLabel_8.setFont(new Font("Montserrat ExtraBold", Font.ITALIC, 14));
		lblNewLabel_8.setBounds(288, 428, 170, 25);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_2_1 = new JLabel("Account Details");
		lblNewLabel_2_1.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(117, 324, 273, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("Sign-up an Account");
		lblNewLabel.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblNewLabel.setBounds(117, 37, 538, 68);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Student Personal Details");
		lblNewLabel_2.setBounds(117, 148, 382, 25);
		lblNewLabel_2.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Are you a:");
		lblNewLabel_1.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(117, 98, 147, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		btnNewButton = new JButton("Sign Up");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(53,79,142));
		btnNewButton.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnNewButton.setBounds(117, 471, 110, 43);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("<HTML><U>Log In</U></HTML>");
		btnNewButton_1.setForeground(new Color(53, 64, 142));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Montserrat Black", Font.PLAIN, 16));
		btnNewButton_1.setBounds(808, 485, 111, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Already have an account?");
		lblNewLabel_7.setFont(new Font("Montserrat", Font.ITALIC, 14));
		lblNewLabel_7.setBounds(622, 493, 191, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel Background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
        Background.setIcon(new ImageIcon(img));
        Background.setBounds(0, 0, 987, 565);
		frame.getContentPane().add(Background);
		
	}
	
	public ArrayList<String> getInfo(){
		ArrayList<String> data = new ArrayList<String>();
		data.add(textField.getText());
		data.add(textField_7.getText());
		data.add(textField_1.getText());
		data.add(textField_2.getText());
		data.add(textField_3.getText());
		data.add(textField_4.getText());
		data.add(String.valueOf(textField_5.getPassword()));
		data.add(String.valueOf(textField_6.getPassword()));
		return data;
	}
	void SignUpListener(ActionListener signupaction) {
		btnNewButton.addActionListener(signupaction);
	}
	void Loginredirect(MouseAdapter LoginDirect) {
		btnNewButton_1.addMouseListener(LoginDirect);
	}
	
}
