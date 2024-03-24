package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("1234");
		WebElement birthday = driver.findElement(By.id("month"));
		Select birthdayMonth = new Select(birthday);
		birthdayMonth.selectByIndex(0);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select birthdate = new Select(day);
		birthdate.selectByIndex(13);
		
 
		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select byear = new Select(birthyear);
		byear.selectByValue("2004");
				
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
		WebElement prefName = driver.findElement(By.name("preferred_pronoun"));
		Select prefPronoun = new Select(prefName);
		prefPronoun.selectByVisibleText("He: Wish him a happy birthday!");
		driver.findElement(By.xpath("//input[@name = 'custom_gender']"));
		
		//select[@name='birthday_year']
		//select[@id='day']
		//select[@id='year']
		//label[text() = 'Female']
		//select[@name = 'preferred_pronoun']
		//input[@name = 'custom_gender']
		

		
		

	}

}
