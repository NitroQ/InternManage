
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class V_Login {

	JFrame frame;
	private JTextField emailTextfield;
	private JButton loginbtn, btnNewButton;
	private JPasswordField passwordTextfield;
	/**
	 * Create the application.
	 */
	public V_Login() {
		initialize();
	}
	public void Exception(Object ex) {
		JOptionPane.showMessageDialog(null, ex );
	}
	void InvalidInput() {
		JOptionPane.showMessageDialog(null,"One or More Fields are empty");
	}
	void InvalidRep() {
		JOptionPane.showMessageDialog(null,"Incorrect Email/Password");
	}
	
	/**
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
		
		JLabel National = new JLabel("National");
		National.setFont(new Font("Montserrat", Font.ITALIC, 38));
		National.setBounds(582, 77, 180, 45);
		frame.getContentPane().add(National);
		
		JLabel University = new JLabel("University");
		University.setFont(new Font("Montserrat", Font.ITALIC, 38));
		University.setBounds(582, 110, 223, 58);
		frame.getContentPane().add(University);
		
		JLabel Internship = new JLabel("Internship");
		Internship.setFont(new Font("Montserrat Black", Font.PLAIN, 38));
		Internship.setBounds(582, 160, 223, 45);
		frame.getContentPane().add(Internship);
		
		JLabel Management = new JLabel("Management");
		Management.setFont(new Font("Montserrat Black", Font.PLAIN, 38));
		Management.setBounds(582, 201, 288, 45);
		frame.getContentPane().add(Management);
		
		JLabel email = new JLabel("EMAIL");
		email.setFont(new Font("Montserrat", Font.BOLD, 15));
		email.setBounds(582, 270, 74, 19);
		frame.getContentPane().add(email);
		
		JLabel password = new JLabel("PASSWORD");
		password.setFont(new Font("Montserrat", Font.BOLD, 15));
		password.setBounds(582, 345, 119, 14);
		frame.getContentPane().add(password);
		
		emailTextfield = new JTextField();
		emailTextfield.setBorder(null);
		emailTextfield.setBackground(new Color(216, 216, 216));
		emailTextfield.setBounds(582, 292, 329, 34);
		frame.getContentPane().add(emailTextfield);
		emailTextfield.setColumns(10);
		
		passwordTextfield = new JPasswordField();
		passwordTextfield.setBorder(null);
		passwordTextfield.setBackground(new Color(216, 216, 216));
		passwordTextfield.setColumns(10);
		passwordTextfield.setBounds(582, 364, 329, 34);
		frame.getContentPane().add(passwordTextfield);
		
		loginbtn = new JButton("Login");
		loginbtn.setFont(new Font("Montserrat Black", Font.PLAIN, 14));
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBorder(null);
		loginbtn.setBounds(582, 413, 74, 29);
		loginbtn.setBackground(new Color(53, 64, 142));
		frame.getContentPane().add(loginbtn);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account?");
		lblNewLabel_1.setFont(new Font("Montserrat", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(582, 485, 174, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML><U>Forgot Password?</U><HTML>");
		lblNewLabel_2.setForeground(new Color(53,79,142));
		lblNewLabel_2.setFont(new Font("Montserrat ExtraBold", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(774, 409, 142, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("<HTML><U>Sign Up</U></HTML>");
		btnNewButton.setForeground(new Color(53, 64, 142));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Montserrat Black", Font.PLAIN, 16));
		btnNewButton.setBounds(759, 478, 111, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Group_3.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 495, 566);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
	public String getPass(){
		String pass = String.valueOf(passwordTextfield.getPassword());
		return pass;		
	}
	public String getEmail() {
		String mail = emailTextfield.getText();
		return mail;
	}
	void LoginListener(ActionListener loginaction) {
		loginbtn.addActionListener(loginaction);
	}
	void Signupredirect(MouseAdapter signUpDirect) {
		btnNewButton.addMouseListener(signUpDirect);
	}
}
