
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_TeacherDash {

	JFrame frame;
	private JTable table_1;
	private  String[] columns = {"Student Name", "Course", "Student ID"};
	 private Object[][] data = {};
	  private DefaultTableModel model = new DefaultTableModel(data, columns);


	/**
	 * Create the application.
	 */
	public V_TeacherDash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void testadd() {
		 model.addRow(new Object []{"Lol", "yep", "damn"});
	}
	
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension (995, 595);
        
		frame = new JFrame("National-U Internship Management");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2, 995, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = new ImageIcon(this.getClass().getResource("/NU.png")).getImage();
		frame.setIconImage(icon);
		
		JLabel lblwelcome = new JLabel("Welcome, Bernie!");
		lblwelcome.setForeground(Color.WHITE);
		lblwelcome.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblwelcome.setBounds(65, 63, 453, 57);
		frame.getContentPane().add(lblwelcome);
		
		JLabel lblclasslist = new JLabel("Class List");
		lblclasslist.setForeground(Color.WHITE);
		lblclasslist.setFont(new Font("Montserrat Black", Font.ITALIC, 34));
		lblclasslist.setBounds(65, 134, 192, 42);
		frame.getContentPane().add(lblclasslist);
		
		JButton refreshbtn = new JButton("Refresh");
		refreshbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		refreshbtn.setFocusPainted(false);
		refreshbtn.setBackground(Color.WHITE);
		refreshbtn.setForeground(new Color(53, 64, 142));
		refreshbtn.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 16));
		refreshbtn.setBorder(null);
		refreshbtn.setBounds(565, 140, 110, 33);
		frame.getContentPane().add(refreshbtn);
		
		
		table_1 = new JTable(model);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(271);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(140);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(146);
		table_1.setRowHeight(30);
		table_1.setBounds(65, 194, 610, 310);
	
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(65, 194, 610, 310);
		frame.getContentPane().add(scrollPane);
		 
		
		JLabel lblmanage = new JLabel("Manage");
		lblmanage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmanage.setForeground(Color.WHITE);
		lblmanage.setFont(new Font("Montserrat Black", Font.ITALIC, 34));
		lblmanage.setBounds(709, 199, 209, 42);
		frame.getContentPane().add(lblmanage);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(705, 258, 216, 83);
		Image img1 = new ImageIcon(this.getClass().getResource("/STUDENT_ACCOUNTS.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(705, 354, 216, 83);
		Image img2 = new ImageIcon(this.getClass().getResource("/ADMIN_SETTINGS.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton backbtn = new JButton("BACK");
		backbtn.setFocusPainted(false);
		backbtn.setForeground(Color.WHITE);
		backbtn.setHorizontalAlignment(SwingConstants.LEADING);
		backbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		backbtn.setContentAreaFilled(false);
		backbtn.setBorder(null);
		backbtn.setBounds(901, 24, 57, 23);
		frame.getContentPane().add(backbtn);
		
		JLabel backbtnvector = new JLabel("");
		backbtnvector.setBounds(885, 28, 11, 14);
		Image img3 = new ImageIcon(this.getClass().getResource("/Vector_white.png")).getImage();
		backbtnvector.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(backbtnvector);
		
		JLabel backgroundimg = new JLabel("");
		backgroundimg.setBounds(0, 0, 989, 566);
		Image img = new ImageIcon(this.getClass().getResource("/Dashboard_Teacher.png")).getImage();
		backgroundimg.setIcon(new ImageIcon(img));
		frame.getContentPane().add(backgroundimg);
		
	}
}
