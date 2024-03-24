package learningPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccount {
	WebDriver driver;
	public RegisterAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterFirstName()
	{
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rosy");
	}
	public void enterLastName()
	{
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Rosy");
	}
	public void enterEmail()
	{
	 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Rosy@test123.com");
}
	public void enterPhone()
	{
		 driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("378-898-8765");
	}
	public void selectCountry()
	{
		WebElement countryDropdown = driver.findElement(By.id("input-country"));
		Select country = new Select(countryDropdown);
		country.selectByVisibleText("Australia");
	}

	public void enterPassword()
	{
		 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test01224");
	}
	
	public void confirmPassword()
	{
		 driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("test01224");
	}
	
	public void newsLetter()
	{ 
		driver.findElement(By.xpath("//input[@type = 'radio' and @value= 1 and @name = 'newsletter']"));
	}
	public void selectSubscription()
	{
		WebElement newssubscription = driver.findElement(By.name("subscription"));
		Select subscription = new Select(newssubscription);
		subscription.selectByVisibleText("Weekly");
	}
	
	public void checkBox()
	{
		driver.findElement(By.name("agree")).click();;
	}
	public void conRegistration()
	{
		driver.findElement(By.id("submitbtn")).click();
	}
	
}