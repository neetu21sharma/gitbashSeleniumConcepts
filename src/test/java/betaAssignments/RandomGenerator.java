package betaAssignments;

import java.util.Random;

public class RandomGenerator {

	public static String main(String[] args) {
		
		{
			//generate the randoom numbers
			
			Random rand = new Random();
			int randomNumber = 1 +rand.nextInt(100);
			//System.out.println("Random number:" + randomNumber);
			
			int uppercase = 65+rand.nextInt(26);//0 to 25
			char upperCaseChar = (char) uppercase;
			//System.out.println("UpperCase Char:::" + upperCaseChar);
			
			int lowerCase = 97+rand.nextInt(26);//0 to 25
			char lowerCaseChar = (char) lowerCase;
			//System.out.println("LowerCase Char:::" + lowerCaseChar);
			
			String emailId = "Neetu" + upperCaseChar + lowerCaseChar+randomNumber+"@rediffmail.com";
			//System.out.println("EmailId::: " + emailId);
			
			String randomSymptoms = "Cold" + "cough";
			System.out.println("randomSymptoms : : " + randomSymptoms);
			 return randomSymptoms;
		}

	}

}
