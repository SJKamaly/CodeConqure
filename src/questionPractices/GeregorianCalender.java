package questionPractices;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GeregorianCalender {
	
	public static void main(String []args) {
		
//		int day, month, year;
//		int second, minute, hour;
//		GregorianCalendar date = new GregorianCalendar();
//		
//		day = date.get(Calendar.DAY_OF_MONTH);
//		month =date.get(Calendar.MONTH);
//		year = date.get(Calendar.YEAR);
//		
//		second = date.get(Calendar.SECOND);
//		minute = date.get(Calendar.MINUTE);
//		hour = date.get(Calendar.HOUR);
//		
//		System.out.println("Curent date is "+ day+"/" +(month)+"/"+year );
		String str = "2024-03-04";
		Date dt=Date.valueOf(str);
        System.out.println(dt);
	}

}
