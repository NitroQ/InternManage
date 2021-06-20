
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class V_UpdateInfo {

	private JFrame frame;
	private JTextField textcompanyname;
	private JTextField textaddress;
	private JTextField textemployername;
	private JTextField textemployeremail;
	private JTextField txtnewemail;
	private JTextField txtprevpass;
	private JTextField txtnewpass;
	private JTextField txtrepnewpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_UpdateInfo window = new V_UpdateInfo();
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
	public V_UpdateInfo() {
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
		
		JLabel updateinfo = new JLabel("Update Information");
		updateinfo.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		updateinfo.setBounds(72, 57, 543, 63);
		frame.getContentPane().add(updateinfo);
		
		JLabel lblcompanyinfo = new JLabel("Company Information:");
		lblcompanyinfo.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblcompanyinfo.setBounds(72, 131, 285, 25);
		frame.getContentPane().add(lblcompanyinfo);
		
		JLabel lblcompanyname = new JLabel("COMPANY NAME");
		lblcompanyname.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblcompanyname.setBounds(72, 169, 187, 14);
		frame.getContentPane().add(lblcompanyname);
		
		JLabel lbladdress = new JLabel("ADDRESS");
		lbladdress.setFont(new Font("Montserrat", Font.BOLD, 15));
		lbladdress.setBounds(72, 231, 124, 14);
		frame.getContentPane().add(lbladdress);
		
		JLabel lblemployername = new JLabel("EMPLOYER NAME");
		lblemployername.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblemployername.setBounds(72, 335, 200, 14);
		frame.getContentPane().add(lblemployername);
		
		JLabel lblemployeremail = new JLabel("EMPLOYER'S EMAIL ADDRESS");
		lblemployeremail.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblemployeremail.setBounds(72, 402, 241, 14);
		frame.getContentPane().add(lblemployeremail);
		
		JLabel lblAccountDetails = new JLabel("Account Details:");
		lblAccountDetails.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblAccountDetails.setBounds(72, 299, 285, 25);
		frame.getContentPane().add(lblAccountDetails);
		
		textcompanyname = new JTextField();
		textcompanyname.setBorder(null);
		textcompanyname.setBackground(new Color(216, 216, 216));
		textcompanyname.setBounds(72, 194, 349, 29);
		frame.getContentPane().add(textcompanyname);
		textcompanyname.setColumns(10);
		
		textaddress = new JTextField();
		textaddress.setColumns(10);
		textaddress.setBorder(null);
		textaddress.setBackground(new Color(216, 216, 216));
		textaddress.setBounds(72, 256, 349, 29);
		frame.getContentPane().add(textaddress);
		
		textemployername = new JTextField();
		textemployername.setColumns(10);
		textemployername.setBorder(null);
		textemployername.setBackground(new Color(216, 216, 216));
		textemployername.setBounds(72, 360, 349, 29);
		frame.getContentPane().add(textemployername);
		
		textemployeremail = new JTextField();
		textemployeremail.setColumns(10);
		textemployeremail.setBorder(null);
		textemployeremail.setBackground(new Color(216, 216, 216));
		textemployeremail.setBounds(72, 427, 349, 29);
		frame.getContentPane().add(textemployeremail);
		
		JLabel lblStudentInformation = new JLabel("Student Information:");
		lblStudentInformation.setFont(new Font("Montserrat Black", Font.ITALIC, 20));
		lblStudentInformation.setBounds(465, 131, 285, 25);
		frame.getContentPane().add(lblStudentInformation);
		
		JButton loginbtn = new JButton("Update");
		loginbtn.setFont(new Font("Montserrat Black", Font.PLAIN, 15));
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBorder(null);
		loginbtn.setBounds(72, 473, 112, 31);
		loginbtn.setBackground(new Color(53, 64, 142));
		frame.getContentPane().add(loginbtn);
		
		JLabel changeemail = new JLabel("Change Email");
		changeemail.setForeground(Color.WHITE);
		changeemail.setFont(new Font("Montserrat Black", Font.ITALIC, 19));
		changeemail.setBounds(488, 189, 160, 25);
		frame.getContentPane().add(changeemail);
		
		JLabel changepass = new JLabel("Change Password");
		changepass.setForeground(Color.WHITE);
		changepass.setFont(new Font("Montserrat Black", Font.ITALIC, 19));
		changepass.setBounds(488, 283, 216, 25);
		frame.getContentPane().add(changepass);
		
		JLabel lblnewemail = new JLabel("NEW EMAIL");
		lblnewemail.setForeground(Color.WHITE);
		lblnewemail.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblnewemail.setBounds(488, 218, 127, 14);
		frame.getContentPane().add(lblnewemail);
		
		JLabel lblprevpass = new JLabel("PREVIOUS PASSWORD");
		lblprevpass.setForeground(Color.WHITE);
		lblprevpass.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblprevpass.setBounds(488, 315, 200, 14);
		frame.getContentPane().add(lblprevpass);
		
		JLabel lblnewpass = new JLabel("NEW PASSWORD");
		lblnewpass.setForeground(Color.WHITE);
		lblnewpass.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblnewpass.setBounds(488, 374, 187, 14);
		frame.getContentPane().add(lblnewpass);
		
		JLabel lblrepnewpass = new JLabel("REPEAT NEW PASSWORD");
		lblrepnewpass.setForeground(Color.WHITE);
		lblrepnewpass.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblrepnewpass.setBounds(686, 374, 200, 14);
		frame.getContentPane().add(lblrepnewpass);
		
		txtnewemail = new JTextField();
		txtnewemail.setBackground(Color.WHITE);
		txtnewemail.setColumns(10);
		txtnewemail.setBorder(null);
		txtnewemail.setBounds(488, 242, 294, 26);
		frame.getContentPane().add(txtnewemail);
		
		txtprevpass = new JTextField();
		txtprevpass.setColumns(10);
		txtprevpass.setBorder(null);
		txtprevpass.setBackground(Color.WHITE);
		txtprevpass.setBounds(488, 339, 185, 26);
		frame.getContentPane().add(txtprevpass);
		
		txtnewpass = new JTextField();
		txtnewpass.setColumns(10);
		txtnewpass.setBorder(null);
		txtnewpass.setBackground(Color.WHITE);
		txtnewpass.setBounds(488, 398, 185, 26);
		frame.getContentPane().add(txtnewpass);
		
		txtrepnewpass = new JTextField();
		txtrepnewpass.setColumns(10);
		txtrepnewpass.setBorder(null);
		txtrepnewpass.setBackground(Color.WHITE);
		txtrepnewpass.setBounds(686, 398, 194, 26);
		frame.getContentPane().add(txtrepnewpass);
		
		JButton emailupdatebtn = new JButton("Update");
		emailupdatebtn.setFont(new Font("Montserrat Black", Font.PLAIN, 13));
		emailupdatebtn.setBorder(null);
		emailupdatebtn.setBackground(new Color(239, 212, 99));
		emailupdatebtn.setBounds(789, 242, 96, 27);
		frame.getContentPane().add(emailupdatebtn);
		
		JButton passupdatebtn = new JButton("Update");
		passupdatebtn.setFont(new Font("Montserrat Black", Font.PLAIN, 13));
		passupdatebtn.setBorder(null);
		passupdatebtn.setBackground(new Color(239, 212, 99));
		passupdatebtn.setBounds(490, 439, 96, 27);
		frame.getContentPane().add(passupdatebtn);
		
		JButton backbtn = new JButton("BACK");
		backbtn.setHorizontalAlignment(SwingConstants.LEADING);
		backbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		backbtn.setContentAreaFilled(false);
		backbtn.setBorder(null);
		backbtn.setBounds(901, 24, 57, 23);
		frame.getContentPane().add(backbtn);
		
		JLabel backbtnvector = new JLabel("");
		backbtnvector.setBounds(885, 28, 11, 14);
		Image img2 = new ImageIcon(this.getClass().getResource("/Vector.png")).getImage();
		backbtnvector.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(backbtnvector);
		
		JLabel backgroundimg = new JLabel("");
		backgroundimg.setBounds(0, 0, 989, 567);
		Image img = new ImageIcon(this.getClass().getResource("/Update_Information.png")).getImage();
		backgroundimg.setIcon(new ImageIcon(img));
		frame.getContentPane().add(backgroundimg);
		
	}

}
