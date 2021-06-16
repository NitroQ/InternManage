
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

public class V_StudentDash extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_StudentDash frames = new V_StudentDash();
					frames.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V_StudentDash() {
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension (995, 595);
		
		frame = new JFrame("National-U Internship Management");
		frame.setResizable(false);
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = new ImageIcon(this.getClass().getResource("/NU.png")).getImage();
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image BG = new ImageIcon(this.getClass().getResource("/Vector_white.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(BG));
		lblNewLabel.setBounds(885, 28, 11, 14);
	    frame.getContentPane().add(lblNewLabel);
		
		JLabel Greeting_1_1 = new JLabel("400");
		Greeting_1_1.setForeground(new Color(239, 212, 99));
		Greeting_1_1.setFont(new Font("Montserrat Black", Font.ITALIC, 128));
		Greeting_1_1.setBounds(131, 318, 269, 93);
		frame.getContentPane().add(Greeting_1_1); 
		
		JLabel lblOutOf = new JLabel("out of");
		lblOutOf.setForeground(Color.WHITE);
		lblOutOf.setFont(new Font("Montserrat Black", Font.ITALIC, 73));
		lblOutOf.setBounds(226, 266, 237, 73);
		frame.getContentPane().add(lblOutOf);
		
		JLabel Greeting_1 = new JLabel("180");
		Greeting_1.setForeground(new Color(239, 212, 99));
		Greeting_1.setFont(new Font("Montserrat Black", Font.ITALIC, 128));
		Greeting_1.setBounds(78, 211, 269, 93);
		frame.getContentPane().add(Greeting_1);
		
		JLabel HoursComplete = new JLabel("Hours Completed ");
		HoursComplete.setForeground(Color.WHITE);
		HoursComplete.setFont(new Font("Montserrat", Font.ITALIC, 26));
		HoursComplete.setBounds(131, 158, 257, 42);
		frame.getContentPane().add(HoursComplete);
		
	      JButton btnNewButton = new JButton("Refresh");
	      btnNewButton.setBackground(new Color(53, 64, 142));
	      btnNewButton.setForeground(new Color(240,240,240));
			btnNewButton.setBorder(null);
			btnNewButton.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
	      btnNewButton.setBounds(191, 460, 89, 23);
	      frame.getContentPane().add(btnNewButton);
	      
		JLabel Greeting = new JLabel("Welcome, Frank!");
		Greeting.setForeground(Color.WHITE);
		Greeting.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		Greeting.setBounds(78, 73, 467, 42);
		frame.getContentPane().add(Greeting);
		
		JButton backbtn = new JButton("BACK");
		backbtn.setFocusPainted(false);
		backbtn.setForeground(Color.WHITE);
		backbtn.setHorizontalAlignment(SwingConstants.LEADING);
		backbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		backbtn.setContentAreaFilled(false);
		backbtn.setBorder(null);
		backbtn.setBounds(901, 24, 57, 23);
		frame.getContentPane().add(backbtn);
		
		JLabel UpdateInfo = new JLabel("");
		Image DTR = new ImageIcon(this.getClass().getResource("/Daily Time Record.png")).getImage();
		UpdateInfo.setIcon(new ImageIcon(DTR));
		UpdateInfo.setBounds(518, 192, 358, 80);
	    frame.getContentPane().add(UpdateInfo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image Upd = new ImageIcon(this.getClass().getResource("/Company Evaluation.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(Upd));
		lblNewLabel_2.setBounds(518, 375, 358, 80);
	    frame.getContentPane().add(lblNewLabel_2);
		
		JLabel CompanyEval = new JLabel("");
		Image comp = new ImageIcon(this.getClass().getResource("/Update your Informations.png")).getImage();
		CompanyEval.setIcon(new ImageIcon(comp));
		CompanyEval.setBounds(518, 269, 358, 108);
	    frame.getContentPane().add(CompanyEval);
		
		JLabel Whitebox = new JLabel("");
		Image whiteb = new ImageIcon(this.getClass().getResource("/whitebox.png")).getImage();
		Whitebox.setIcon(new ImageIcon(whiteb));
		Whitebox.setBounds(488, 154, 410, 329);
	    frame.getContentPane().add(Whitebox);
		
		JLabel DashboardBG = new JLabel("");
	      Image img3 = new ImageIcon(this.getClass().getResource("/Group 18.png")).getImage();
	      DashboardBG.setIcon(new ImageIcon(img3));
	      DashboardBG.setBounds(0, 0, 987, 556);
	      frame.getContentPane().add(DashboardBG);
	      
	
		
	}
}
