 package mmp.lib;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

	public class AppLibrary {
		public static String getFutureDate(int noofDays,String dateFormat)
		{
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, noofDays);
			Date d = cal.getTime();
			System.out.println(cal.getTime());
			SimpleDateFormat sdfObj = new SimpleDateFormat(dateFormat);
			String s = sdfObj.format(d);
			System.out.println(s);
			return s;
		}
		public static String generateRandomString()
		{
			/*
			 * Generate the Random Email ID
			 */
			Random rand = new Random();
			int randomNumber = 1+rand.nextInt(100);//0 to 99
			//System.out.println("Random number:" + randomNumber);

			int upperCase = 65+rand.nextInt(26);//0 to 25
			char upperCaseChar = (char) upperCase;
			//System.out.println("UpperCase Char:::" + upperCaseChar);


			int lowerCase = 97+rand.nextInt(26);//0 to 25
			char lowerCaseChar = (char) lowerCase;
			//System.out.println("lowerCase Char:::" + lowerCaseChar);


			String randomString="AutoTester"+upperCaseChar+lowerCaseChar+randomNumber;
			System.out.println("randomString:::  " + randomString);

			return randomString;
		}

	
	}


