
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class V_ManageStu {

	JFrame frame;
	private JTable table;
	private JScrollPane scrollTable;
	private JButton backbtn, btnNewButton , btnNewButton_1, btnNewButton_3, btnNewButton_2;
	private JLabel lblNewLabel_3, lblNewLabel_2;
	private  String[] columns = {"Date", "Time In", "Time Out", "Total", "Proof", "Validate"};
	 private Object[][] data = {};
	  @SuppressWarnings("serial")
	private DefaultTableModel model = new DefaultTableModel(data, columns) {
		  @Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
	  };
   
	public V_ManageStu() {
		initialize();
		frame.setVisible(true);
	}

	void addObject(Object[] lah) {
		 model.addRow(lah);
	}
	public void Exception(Object ex) {
		JOptionPane.showMessageDialog(null, ex );
	}
	 void refreshPane() {
		 JOptionPane.showMessageDialog(null, "Up-to-Date");
		}
	 void noSelected() {
		 JOptionPane.showMessageDialog(null, "No Selected Row");
		}
	void backbutton(ActionListener back) {
		backbtn.addActionListener(back);
	}
	void refreshbutton(ActionListener ref) {
		btnNewButton_1.addActionListener(ref);
	}
	void invalidbutton(ActionListener in) {
		btnNewButton_3.addActionListener(in);
	}
	void validatebutton(ActionListener val) {
		btnNewButton.addActionListener(val);
	}
	void evalbutton(ActionListener am) {
		btnNewButton_2.addActionListener(am);
	}
	void evalButtonAv() {
		btnNewButton_2.setVisible(true);
	}
	void evalData(String[] data) {
		String eval = "<HTML><B>Evaluation</B> <br> Q1: " + data[0] + "<br> Q2: " + data[1] + "<br> Q3: " + data[2] + "<br> Q4: " + data[3] + "</HTML>";
		JOptionPane.showMessageDialog(null, eval);
	}
	void setNameStu(String StudID, String Name) {
		lblNewLabel_3.setText(StudID);
		lblNewLabel_2.setText(Name);
	}
	public String getDate() {
		int row = table.getSelectedRow();
		String date = "";
		if(row != -1) {
			date = model.getValueAt(row, 0).toString();
		}
		return date;
	}
	void resetTable() {
		model.setRowCount(0);
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

		
		table = new JTable(model);		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowHeight(30);
		table.setBounds(75, 189, 852, 343);
		scrollTable = new JScrollPane(table);
		scrollTable.setBounds(75, 189, 852, 343);
		frame.getContentPane().add(scrollTable);
		
		lblNewLabel_2 = new JLabel("Gesmundo, Frank Vincent");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Montserrat Black", Font.ITALIC, 21));
		lblNewLabel_2.setForeground(new Color(53, 64, 142));
		lblNewLabel_2.setBounds(559, 70, 368, 57);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("2020-103235");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Montserrat Black", Font.ITALIC, 21));
		lblNewLabel_3.setForeground(new Color(53, 64, 142));
		lblNewLabel_3.setBounds(727, 100, 200, 57);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Manage Student");
		lblNewLabel.setFont(new Font("Montserrat Black", Font.ITALIC, 46));
		lblNewLabel.setBounds(73, 70, 476, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Validate Time Record");
		lblNewLabel_1.setFont(new Font("Montserrat", Font.ITALIC, 26));
		lblNewLabel_1.setBounds(73, 134, 287, 57);
		frame.getContentPane().add(lblNewLabel_1);

		backbtn = new JButton("BACK");
		backbtn.setHorizontalAlignment(SwingConstants.LEADING);
		backbtn.setFont(new Font("Montserrat", Font.PLAIN, 16));
		backbtn.setContentAreaFilled(false);
		backbtn.setBorder(null);
		backbtn.setBounds(901, 24, 57, 23);
		frame.getContentPane().add(backbtn);
		
		btnNewButton = new JButton("Validate");
		btnNewButton.setBackground(new Color(53, 64, 142));
	    btnNewButton.setForeground(new Color(240,240,240));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(838, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setBackground(new Color(53, 64, 142));
	    btnNewButton_1.setForeground(new Color(240,240,240));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(634, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("Invalid");
		btnNewButton_3.setBackground(new Color(53, 64, 142));
	    btnNewButton_3.setForeground(new Color(240,240,240));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_3.setBounds(737, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("Evaluated");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.setBackground(new Color(53, 64, 142));
	    btnNewButton_2.setForeground(new Color(240,240,240));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setFont(new Font("Montserrat", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setBounds(634, 120, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
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
