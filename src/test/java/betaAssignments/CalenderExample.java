package betaAssignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderExample {

	public static void main(String[] args) {
		
		getFutureDate(0,"dd/MMMM/YYYY");
		getFutureDate(365, "dd/MM/YYYY");
		getFutureDate(200, "dd/MMMM/YY");
		getFutureDate(60, "dd/MMMM/YYYY");
		
		

	}

	private static void getFutureDate(int noofDays, String dateFormat) 
		{
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, noofDays);
			Date d = cal.getTime();
			System.out.println(cal.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			String s = sdf.format(d);
			System.out.println(s);
			return;
		//	String dateArr[] = s.split("/");
		//	System.out.println("DD::" + dateArr[0]);
		//	System.out.println("MMMM::" + dateArr[1]);
		//	System.out.println("YYYY::" + dateArr[2]);
			
			
			
			
		}
		
	}


