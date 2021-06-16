
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class V_ManageStu {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollTable;
	private  String[] columns = {"Date", "Time In", "Time Out", "Total", "Proof", "Validate"};
	 private Object[][] data = {
			 	{null, null, null, null, null, null},
	    		{null, null, null, null, null, null},
	    		{null, null, null, null, null, null}};
	  private DefaultTableModel model = new DefaultTableModel(data, columns);
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_ManageStu window = new V_ManageStu();
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
	public V_ManageStu() {
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

		
		table = new JTable(model);		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowHeight(30);
		table.setBounds(75, 189, 852, 343);
		scrollTable = new JScrollPane(table);
		scrollTable.setBounds(75, 189, 852, 343);
		frame.getContentPane().add(scrollTable);
		
		JLabel lblNewLabel_2 = new JLabel("Gesmundo, Frank Vincent T.");
		lblNewLabel_2.setFont(new Font("Montserrat Black", Font.ITALIC, 21));
		lblNewLabel_2.setForeground(new Color(53, 64, 142));
		lblNewLabel_2.setBounds(597, 106, 439, 57);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2020-103235");
		lblNewLabel_3.setFont(new Font("Montserrat Black", Font.ITALIC, 21));
		lblNewLabel_3.setForeground(new Color(53, 64, 142));
		lblNewLabel_3.setBounds(777, 136, 287, 57);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Manage Student");
		lblNewLabel.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblNewLabel.setBounds(73, 70, 476, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Validate Time Record");
		lblNewLabel_1.setFont(new Font("Montserrat", Font.ITALIC, 26));
		lblNewLabel_1.setBounds(73, 134, 287, 57);
		frame.getContentPane().add(lblNewLabel_1);

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
		
		JLabel Background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Manage Students.png")).getImage();
        Background.setIcon(new ImageIcon(img));
        Background.setBounds(0, 0, 989, 566);
		frame.getContentPane().add(Background);
		
	
		
	
		
		

	}
}
