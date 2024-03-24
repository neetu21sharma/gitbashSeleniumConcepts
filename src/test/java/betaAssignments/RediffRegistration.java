package betaAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffRegistration {

	public static void main(String[] args)throws InterruptedException
	{
		
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath["//input[@type = 'text'))).sendKeys("Josh Grover");
		
		
		  driver.findElement(By.xpath("//input[@type = 'text']")). sendKeys("Josh Grover");
		  
		  // driver.findElement(By.xpath("//input[@name = 'namea77cb7f2']")). sendKeys("Josh Grover");
		  driver.findElement(By.xpath("//input[contains(@name, 'login')]")).sendKeys("Josh123");
		  driver.findElement(By.xpath("//input[@id = 'newpasswd']")).sendKeys("test@1234");
		  driver.findElement(By.xpath("//input[contains(@name, 'confirm')]")).sendKeys("test@1234");
		  driver.findElement(By.xpath("//input[contains(@name, 'altemail')]")).sendKeys("test@rediff.com");
		  driver.findElement(By.id("mobno")).sendKeys("320-222-0871");
		  
		  
		  WebElement dateOfBirth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]")); 
		  Select birthday = new Select(dateOfBirth);
		  birthday.selectByIndex(4);
		  
		  WebElement birthMonth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		  Select birthdayMonth = new Select(birthMonth);
		  birthdayMonth.selectByVisibleText("NOV");
		  
		  WebElement birthYear = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]")); 
		  Select birthdayYear = new Select(birthYear);
		  birthdayYear.selectByValue("2004");
		  
		  driver.findElement(By.xpath("//input[@type='radio' and @value = 'm']")).click();
		  
		  //for female
		  driver.findElement(By.xpath("//input[@type ='radio'and @value = 'f']")).click();
		  WebElement countryList = driver.findElement(By.id("country"));
		  Select countryDropdown = new Select(countryList);
		  countryDropdown.selectByVisibleText("India");
		  
		  
		  
		  WebElement city =driver.findElement(By.xpath("//select[contains(@name, 'city')]")); 
		  Select cityDropdown = new Select(city); 
		  cityDropdown.selectByVisibleText("Bhopal");
		  
		  //driver.findElement(By. xpath("//input[@name = '8e669ff822ffeab60da1743c004d88c4020c7bdd']")).
		//  sendKeys("KMC4"); // driver.findElement(By.id("Register")).click();
		  utilities.HandlingCommonActions.tearDown();
		  
		 
		
	}

}
