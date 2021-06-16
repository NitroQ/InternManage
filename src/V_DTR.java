
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_DTR extends JFrame {

	private JFrame frame;
	private JTextArea TextBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_DTR frame = new V_DTR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V_DTR() {
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension (995, 595);
		
		frame = new JFrame("National-U Internship Management");
		frame.setResizable(false);
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = new ImageIcon(this.getClass().getResource("/NU.png")).getImage();
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPhoto = new JLabel("photo");
		lblPhoto.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblPhoto.setBounds(468, 427, 57, 37);
		frame.getContentPane().add(lblPhoto);
		
		JLabel lblAttach = new JLabel("Attach");
		lblAttach.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblAttach.setBounds(468, 414, 57, 37);
		frame.getContentPane().add(lblAttach);
		
		JLabel PaperClipBG = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/Paperclip.png")).getImage();
		PaperClipBG.setIcon(new ImageIcon(img3));
		PaperClipBG.setBounds(442, 422, 32, 37);
		frame.getContentPane().add(PaperClipBG);
		
		TextBox = new JTextArea();
		TextBox.setBorder(BorderFactory.createLineBorder(Color.black));
		TextBox.setFont(new Font("Montserrat", Font.PLAIN, 14));
		TextBox.setBounds(442, 200, 482, 212);
		frame.getContentPane().add(TextBox);
		TextBox.setColumns(10);
		
		JButton SubmitBttn = new JButton("Submit");
		SubmitBttn.setForeground(Color.WHITE);
		SubmitBttn.setFont(new Font("Montserrat", Font.BOLD, 16));
		SubmitBttn.setBackground(new Color(53, 64, 142));
		SubmitBttn.setBounds(827, 431, 97, 28);
		frame.getContentPane().add(SubmitBttn);
		
		JLabel NarrativeReportText = new JLabel("Narrative Report");
		NarrativeReportText.setFont(new Font("Montserrat", Font.ITALIC, 28));
		NarrativeReportText.setBounds(442, 152, 283, 37);
		frame.getContentPane().add(NarrativeReportText);
		
		JLabel DocumentationText = new JLabel("Documentation");
		DocumentationText.setFont(new Font("Montserrat Black", Font.BOLD | Font.ITALIC, 34));
		DocumentationText.setBounds(444, 100, 386, 75);
		frame.getContentPane().add(DocumentationText);
		
		JLabel Time = new JLabel("12:00:13");
		Time.setFont(new Font("Montserrat Black", Font.BOLD | Font.ITALIC, 72));
		Time.setBounds(82, 293, 319, 96);
		frame.getContentPane().add(Time);
		
		JLabel DailyTimeRecordText = new JLabel("Daily Time ");
		DailyTimeRecordText.setFont(new Font("Montserrat Black", Font.BOLD | Font.ITALIC, 46));
		DailyTimeRecordText.setBounds(82, 140, 319, 75);
		frame.getContentPane().add(DailyTimeRecordText);
		
		JLabel Date = new JLabel("June 13, 2021");
		Date.setFont(new Font("Montserrat", Font.PLAIN, 28));
		Date.setBounds(82, 226, 283, 75);
		frame.getContentPane().add(Date);
		
		JLabel RecordText = new JLabel("Record ");
		RecordText.setFont(new Font("Montserrat Black", Font.BOLD | Font.ITALIC, 46));
		RecordText.setBounds(82, 184, 283, 75);
		frame.getContentPane().add(RecordText);
		
		JButton TimeInBttn = new JButton("Time In");
		TimeInBttn.setForeground(Color.WHITE);
		TimeInBttn.setFont(new Font("Montserrat", Font.BOLD, 21));
		TimeInBttn.setBackground(new Color(53, 64, 142));
		TimeInBttn.setBounds(82, 410, 142, 38);
		frame.getContentPane().add(TimeInBttn);
		
		JButton TimeOutBttn = new JButton("Time Out");
		TimeOutBttn.setForeground(new Color(255, 255, 255));
		TimeOutBttn.setFont(new Font("Montserrat", Font.BOLD, 21));
		TimeOutBttn.setBackground(new Color(53, 64, 142));
		TimeOutBttn.setBounds(236, 410, 140, 38);
		frame.getContentPane().add(TimeOutBttn);
		
		JLabel MultipleColorBG = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/lineart.png")).getImage();
		MultipleColorBG.setIcon(new ImageIcon(img2));
		MultipleColorBG.setBounds(386, -70, 694, 681);
		frame.getContentPane().add(MultipleColorBG);
		
		JButton backbtn = new JButton("BACK");
		backbtn.setHorizontalAlignment(SwingConstants.LEADING);
		backbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		backbtn.setContentAreaFilled(false);
		backbtn.setBorder(null);
		backbtn.setBounds(901, 24, 57, 23);
		frame.getContentPane().add(backbtn);
		
		JLabel backbtnvector = new JLabel("");
		backbtnvector.setBounds(885, 28, 11, 14);
		Image img5 = new ImageIcon(this.getClass().getResource("/Vector.png")).getImage();
		backbtnvector.setIcon(new ImageIcon(img5));
		frame.getContentPane().add(backbtnvector);
		
		
		JLabel WhiteBG = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/white.jpg")).getImage();
        WhiteBG.setIcon(new ImageIcon(img));
		WhiteBG.setBounds(0, 0, 989, 566);
		frame.getContentPane().add(WhiteBG);
	}
}
