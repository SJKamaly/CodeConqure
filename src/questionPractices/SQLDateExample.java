package questionPractices;

import java.util.*;

public class SQLDateExample {

	public static void main(String[] args) {
		
		long miles = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(miles);
		System.out.println(date);
		
		 int day, month, year;
    	 int second, minute, hour;
    	 
    	 GregorianCalendar dt = new GregorianCalendar();
    	 day =dt.get(Calendar.DAY_OF_MONTH);
    	 month =dt.get(Calendar.MONTH);
    	 year = dt.get(Calendar.YEAR);
    	 
    	 second =dt.get(Calendar.SECOND);
    	 minute = dt.get(Calendar.MINUTE);
    	 hour = dt.get(Calendar.HOUR);
    	 
    	 System.out.println("Current date "+ day+"/"+(month+1)+"/"+year);
    	 System.out.println("Current time "+ hour+":"+minute +":"+second);
    	 
    	

	}

}



