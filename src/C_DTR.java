import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class C_DTR extends SQLConnect {
	V_DTR vdt;
	M_DTR mdt;
	public DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
	public DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");  
	
	public C_DTR(V_DTR vdt, M_DTR mdt) {
		this.vdt = vdt;
		this.mdt = mdt;
		
		vdt.frame.setVisible(true);	
	
		updateTime();
		checkTime();
		vdt.TimeIn(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TimeIn();
				checkTime();
			}
			
		});
		vdt.TimeOut(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TimeOut();
				checkTime();
			}
			
		});
		vdt.backbutton(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				V_StudentDash vs = new V_StudentDash();
				M_StudentDash ms = new M_StudentDash(mdt.getName(), mdt.getStudID());
				 @SuppressWarnings("unused")
				C_StudentDash cs = new C_StudentDash(vs,ms);
				vdt.frame.dispose();
				
			}
			
		});
		
	}
	private String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		String time = String.valueOf(hour)+ ":"+String.valueOf(min)+ ":"+ String.valueOf(sec);
		return time;
	}
	private String getDate() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int mon = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		String date = String.valueOf(day)+ "/"+String.valueOf(mon)+ "/"+ String.valueOf(year);
		return date;
	
	}
	
	private void TimeIn() {
			 try{
				 String query = "INSERT INTO `dtr`(`Date`, `TimeIn`, `TimeOut`, `Total`, `Proof`, `Validate`, `StudID`) VALUES (?,?,?,?,?,?,?)";
			    con = DriverManager.getConnection(connect,"root","");
			    ps = con.prepareStatement(query);
	             ps.setString(1, getDate());
	             ps.setString(2, getTime());
	             ps.setString(3, "");
	             ps.setString(4, "");
	             ps.setString(5, "");
	             ps.setString(6, "Not Validated");
	             ps.setString(7, mdt.getStudID());
	             ps.executeUpdate();
	    	 }catch(HeadlessException | SQLException ex){
	            vdt.Exception(ex);
	         }
		 
		
	}
	private void TimeOut() {
		mdt.setDocu(vdt.getDocu());
		if (mdt.getDocu() == null) {
			vdt.NoDocumentation();
		}else if(mdt.getDocu() != null) {
			if(mdt.getDocu().trim().equals("")) {
				vdt.NoDocumentation();
			}else {
				try {
		        	String query1 = "UPDATE `dtr` SET `TimeOut`= ? ,`Total`= ?,`Proof`= ? WHERE `Date` = ? AND `StudID` = ?";
		           con = DriverManager.getConnection(connect,"root","");
		           ps = con.prepareStatement(query1);
		           ps.setString(1, getTime());
		           ps.setString(2, calcTime());
		           ps.setString(3, mdt.getDocu());
		           ps.setString(4, getDate());
		           ps.setString(5, mdt.getStudID());
		           ps.executeUpdate();
		                  
		        } catch (Exception ex) {
		            vdt.Exception(ex);
		         }
			}
		}
	}
	private String calcTime() {
		int hour = 0;
		int min = 0;
		 if(mdt.getTimeIn() != null) {
	       	 	String[] timein = mdt.getTimeIn().split(":");
	       	 	String[] timeout = getTime().split(":");
	       	 	hour += Integer.parseInt(timeout[0])-Integer.parseInt(timein[0]);
	       	 	int start = Integer.parseInt(timein[1]);
	       	 	int end = Integer.parseInt(timeout[1]);
	       	 	if(start > end){
	             --hour;
	             min += 60;
	       	 	}
	       	 	min += Math.abs(end-start);
		 }
       	 String result = String.valueOf((hour*60) + min);
		 return result;
	}
	private void checkTime() {
        try {
        	String query1 = "SELECT * FROM `dtr` WHERE `Date` = ? AND `StudID` = ?";
           con = DriverManager.getConnection(connect,"root","");
           ps = con.prepareStatement(query1);
           ps.setString(1, getDate());
           ps.setString(2, mdt.getStudID());
           rs = ps.executeQuery();
            while(rs.next()){
             mdt.setDate(rs.getString("Date"));
             mdt.setTimeIn(rs.getString("TimeIn"));
             mdt.setTimeOut(rs.getString("TimeOut"));
            }
           
        } catch (Exception ex) {
            vdt.Exception(ex);
         }
    
       if(mdt.getDate() != null) {
    	   if(mdt.getDate().contains(getDate())){
    	       	 vdt.setTimeInDisabled();
    	          }
       }
       if(mdt.getTimeIn() == null) {
 	       	 	vdt.setTimeOutDisabled();
       }
       if(mdt.getTimeIn() != null) {
       	 	vdt.setTimeOutEnabled();
       }
       if(mdt.getTimeOut() != null) {
    	   if(!mdt.getTimeOut().equals("")){
  	       	 	vdt.setTimeOutDisabled();
  	          }
      }
     
	}
	
	public void updateTime() {
		Thread clock = new Thread() {
			public void run() {
				for(;;) {
					try {
						vdt.setTime(getTime());
						sleep(1000);
					} catch (InterruptedException e) {
						vdt.Exception(e);
					}
				}				
			}
		};
		clock.start();
		LocalDateTime now = LocalDateTime.now();  
		DateTimeFormatter dat = DateTimeFormatter.ofPattern("MMMM dd, yyyy");  
		vdt.setDate(dat.format(now));

	}
	
}
