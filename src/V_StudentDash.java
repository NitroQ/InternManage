import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class V_StudentDash extends JFrame {

	JFrame frame;
	private JButton UpdateInfo, logoutbtn, btnNewButton, lblNewLabel_2;
	private JLabel Greeting, Greeting_1;
	public V_StudentDash() {
		initialize();
	}

	void openDTR(MouseAdapter dtr) {
		UpdateInfo.addMouseListener(dtr);
	}
	void openRecord(MouseAdapter rec) {
		lblNewLabel_2.addMouseListener(rec);
	}
	void setwelcome(String name) {
		Greeting.setText("Welcome, " + name);
	}
	void logoutbutton(ActionListener logout) {
		logoutbtn.addActionListener(logout);
	}
	void refreshbutton(ActionListener ref) {
		btnNewButton.addActionListener(ref);
	}
	void setHours(String hr) {
		Greeting_1.setText(hr);
	}
	public void initialize() {
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
		
		JLabel lblNewLabel = new JLabel("");
		Image BG = new ImageIcon(this.getClass().getResource("/Vector_white.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(BG));
		lblNewLabel.setBounds(865, 28, 11, 14);
	    frame.getContentPane().add(lblNewLabel);
		
		JLabel Greeting_1_1 = new JLabel("400");
		Greeting_1_1.setForeground(new Color(239, 212, 99));
		Greeting_1_1.setFont(new Font("Montserrat Black", Font.ITALIC, 128));
		Greeting_1_1.setBounds(108, 356, 269, 93);
		frame.getContentPane().add(Greeting_1_1); 
		
		JLabel lblOutOf = new JLabel("out of");
		lblOutOf.setForeground(Color.WHITE);
		lblOutOf.setFont(new Font("Montserrat Black", Font.ITALIC, 30));
		lblOutOf.setBounds(203, 310, 113, 42);
		frame.getContentPane().add(lblOutOf);
		
		Greeting_1 = new JLabel("000");
		Greeting_1.setHorizontalAlignment(SwingConstants.CENTER);
		Greeting_1.setForeground(new Color(239, 212, 99));
		Greeting_1.setFont(new Font("Montserrat Black", Font.ITALIC, 125));
		Greeting_1.setBounds(129, 211, 269, 93);
		frame.getContentPane().add(Greeting_1);
		
		JLabel HoursComplete = new JLabel("Hours Completed ");
		HoursComplete.setForeground(Color.WHITE);
		HoursComplete.setFont(new Font("Montserrat", Font.ITALIC, 26));
		HoursComplete.setBounds(147, 158, 257, 42);
		frame.getContentPane().add(HoursComplete);
		
	      btnNewButton = new JButton("Refresh");
	      btnNewButton.setBackground(new Color(240,240,240));
	      btnNewButton.setForeground(new Color(53, 64, 142));
			btnNewButton.setBorder(null);
			btnNewButton.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
	      btnNewButton.setBounds(203, 470, 89, 23);
	      frame.getContentPane().add(btnNewButton);
	      
		Greeting = new JLabel("");
		Greeting.setForeground(Color.WHITE);
		Greeting.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		Greeting.setBounds(78, 73, 716, 42);
		frame.getContentPane().add(Greeting);
		
		logoutbtn = new JButton("LOGOUT");
		logoutbtn.setFocusPainted(false);
		logoutbtn.setForeground(Color.WHITE);
		logoutbtn.setHorizontalAlignment(SwingConstants.LEADING);
		logoutbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		logoutbtn.setContentAreaFilled(false);
		logoutbtn.setBorder(null);
		logoutbtn.setBounds(885, 24, 73, 23);
		frame.getContentPane().add(logoutbtn);
		
		UpdateInfo = new JButton("");
		Image DTR = new ImageIcon(this.getClass().getResource("/Daily Time Record.png")).getImage();
		UpdateInfo.setIcon(new ImageIcon(DTR));
		UpdateInfo.setBounds(518, 193, 358, 80);
	    frame.getContentPane().add(UpdateInfo);
		
	    lblNewLabel_2 = new JButton("");
	    Image comp = new ImageIcon(this.getClass().getResource("/Group 30.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(comp));
		lblNewLabel_2.setBounds(518, 284, 358, 80);
	    frame.getContentPane().add(lblNewLabel_2);
		
	    JButton CompanyEval = new JButton("");
	    Image Upd = new ImageIcon(this.getClass().getResource("/Company Evaluation.png")).getImage();
		CompanyEval.setIcon(new ImageIcon(Upd));
		CompanyEval.setBounds(518, 375, 358, 80);
	    frame.getContentPane().add(CompanyEval);
		
		JLabel Whitebox = new JLabel("");
		Image whiteb = new ImageIcon(this.getClass().getResource("/whitebox.png")).getImage();
		Whitebox.setIcon(new ImageIcon(whiteb));
		Whitebox.setBounds(491, 177, 410, 294);
	    frame.getContentPane().add(Whitebox);
		
		JLabel DashboardBG = new JLabel("");
	      Image img3 = new ImageIcon(this.getClass().getResource("/Group 18.png")).getImage();
	      DashboardBG.setIcon(new ImageIcon(img3));
	      DashboardBG.setBounds(0, 0, 987, 566);
	      frame.getContentPane().add(DashboardBG);
	      
	
		
	}

	 void Exception(Exception ex) {
		 JOptionPane.showMessageDialog(null, ex );
	}
	 void refreshPane() {
		 JOptionPane.showMessageDialog(null, "Up-to-Date");
		}
}
