package betaAssignments;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MessagePage {
	
	 WebDriver driver;
	@Test
	
	public void message() throws InterruptedException
	{
			
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/sendmessage.php");
	driver.findElement(By.id("subject")).sendKeys("Account Balance");
	driver.findElement(By.xpath("//textarea[@id = 'message']")).sendKeys("Need to talk to someone at account department");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	 
	}
	public String generateRandomString()
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


		String randomString="OverCharges" +randomNumber;
		System.out.println("randomString:::  " + randomString);

		return randomString;
	}


}
