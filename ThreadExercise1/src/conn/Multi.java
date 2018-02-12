package conn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Multi extends Thread {

	@Override
		public void run(){
		
			
		String alarmt="04.00";
		
		
		DateFormat dateFormat = new SimpleDateFormat("hh.mm ");
    	String dateString = dateFormat.format(new Date()).toString();
    	System.out.println("Current time is : "+dateString);
    	
		
			
		System.out.println("Alarm time is :"+alarmt);
		if(alarmt==dateString)
		{
			System.out.println("Ringing the Alarm");
		}
		else
		{
			System.out.println(" Not Ringing the Alarm");	
		}
    	
		
		
			
		}
		public static void main(String args[]){ 
			
			
		Multi m1=new Multi();  
		m1.start();
	
		 }  
		 

}
