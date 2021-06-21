
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class V_TeacherDash {

	JFrame frame;
	private JTable table_1;
	private JLabel lblwelcome;
	private JButton refreshbtn, logoutbtn;
	private  String[] columns = {"Student Name", "Course", "Student ID"};
	 private Object[][] data = {};
	  @SuppressWarnings("serial")
	private DefaultTableModel model = new DefaultTableModel(data, columns) {
	  		@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		
			};


	/**
	 * Create the application.
	 */
	public V_TeacherDash() {
		initialize();
		
	}
	void resetTable() {
		model.setRowCount(0);
	}
	public void Exception(Object ex) {
		JOptionPane.showMessageDialog(null, ex );
	}
	void refreshPane() {
		 JOptionPane.showMessageDialog(null, "Up-to-Date");
		}
	void addObject(Object[] lah) {
		 model.addRow(lah);
	}
	void editName(String Name) {
		lblwelcome.setText("Welcome, " + Name);
	}
	void refreshData(ActionListener ref) {
		refreshbtn.addActionListener(ref);
	}
	void logoutbutton(ActionListener logout) {
		logoutbtn.addActionListener(logout);
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
		
		lblwelcome = new JLabel("");
		lblwelcome.setForeground(Color.WHITE);
		lblwelcome.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblwelcome.setBounds(65, 63, 453, 57);
		frame.getContentPane().add(lblwelcome);
		
		JLabel lblclasslist = new JLabel("Class List");
		lblclasslist.setForeground(Color.WHITE);
		lblclasslist.setFont(new Font("Montserrat Black", Font.ITALIC, 34));
		lblclasslist.setBounds(65, 134, 192, 42);
		frame.getContentPane().add(lblclasslist);
		
		refreshbtn = new JButton("Refresh");
		refreshbtn.setFocusPainted(false);
		refreshbtn.setBackground(Color.WHITE);
		refreshbtn.setForeground(new Color(53, 64, 142));
		refreshbtn.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 16));
		refreshbtn.setBorder(null);
		refreshbtn.setBounds(571, 145, 110, 33);
		frame.getContentPane().add(refreshbtn);
		
		
		table_1 = new JTable(model);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(271);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(140);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(146);
		table_1.setRowHeight(30);
		table_1.setRowSelectionAllowed(true);
		table_1.setBounds(65, 194, 610, 310);
	
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(65, 194, 622, 310);
		frame.getContentPane().add(scrollPane);
		 
		
		JLabel lblmanage = new JLabel("Manage");
		lblmanage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmanage.setForeground(Color.WHITE);
		lblmanage.setFont(new Font("Montserrat Black", Font.ITALIC, 34));
		lblmanage.setBounds(728, 199, 209, 42);
		frame.getContentPane().add(lblmanage);
		
		JButton refreshbtn_1 = new JButton("Delete");
		refreshbtn_1.setForeground(new Color(53, 64, 142));
		refreshbtn_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 16));
		refreshbtn_1.setFocusPainted(false);
		refreshbtn_1.setBorder(null);
		refreshbtn_1.setBackground(Color.WHITE);
		refreshbtn_1.setBounds(763, 261, 136, 53);
		frame.getContentPane().add(refreshbtn_1);
		
		JButton refreshbtn_1_1 = new JButton("Edit");
		refreshbtn_1_1.setForeground(new Color(53, 64, 142));
		refreshbtn_1_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 16));
		refreshbtn_1_1.setFocusPainted(false);
		refreshbtn_1_1.setBorder(null);
		refreshbtn_1_1.setBackground(Color.WHITE);
		refreshbtn_1_1.setBounds(764, 328, 136, 53);
		frame.getContentPane().add(refreshbtn_1_1);
		
//		JButton btnNewButton = new JButton("");
//		btnNewButton.setBorder(null);
//		btnNewButton.setBounds(705, 258, 216, 83);
//		Image img1 = new ImageIcon(this.getClass().getResource("/STUDENT_ACCOUNTS.png")).getImage();
//		btnNewButton.setIcon(new ImageIcon(img1));
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("");
//		btnNewButton_1.setBorder(null);
//		btnNewButton_1.setBounds(705, 354, 216, 83);
//		Image img2 = new ImageIcon(this.getClass().getResource("/ADMIN_SETTINGS.png")).getImage();
//		btnNewButton_1.setIcon(new ImageIcon(img2));
//		frame.getContentPane().add(btnNewButton_1);
		
		logoutbtn = new JButton("LOGOUT");
		logoutbtn.setFocusPainted(false);
		logoutbtn.setForeground(Color.WHITE);
		logoutbtn.setHorizontalAlignment(SwingConstants.LEADING);
		logoutbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		logoutbtn.setContentAreaFilled(false);
		logoutbtn.setBorder(null);
		logoutbtn.setBounds(885, 24, 73, 23);
		frame.getContentPane().add(logoutbtn);
		
		JLabel backbtnvector = new JLabel("");
		backbtnvector.setBounds(865, 28, 11, 14);
		Image img3 = new ImageIcon(this.getClass().getResource("/Vector_white.png")).getImage();
		backbtnvector.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(backbtnvector);
		
		JLabel backgroundimg = new JLabel("");
		backgroundimg.setBounds(0, 0, 989, 566);
		Image img = new ImageIcon(this.getClass().getResource("/Dashboard_Teacher.png")).getImage();
		backgroundimg.setIcon(new ImageIcon(img));
		frame.getContentPane().add(backgroundimg);
		
	
		
	
	}
	void TableSelected(MouseAdapter select) {
		table_1.addMouseListener(select);
	}
	public String getSelectedStudID() {
		int row = table_1.getSelectedRow();
		String value = table_1.getModel().getValueAt(row, 2).toString();
		return value;
	}
	public String getSelectedName() {
		int row = table_1.getSelectedRow();
		String value = table_1.getModel().getValueAt(row, 0).toString();
		return value;
	}
}
