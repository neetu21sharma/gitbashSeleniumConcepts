package betaAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistration2 {

	public static void main(String[] args) {
		
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//td[text() = 'Full Name']/following-sibling::td[2]/input[@type='text']")).sendKeys("Jack Joey");
		
		driver.findElement(By.xpath("//td[text() = 'Choose a Rediffmail ID']/following-sibling::td[2]/input[@type='text']")).sendKeys("Jack123");
		
		driver.findElement(By.xpath("//td[text() = 'Password']/following-sibling::td[2]/input[@type='password']")).sendKeys("Jack123!!");
		driver.findElement(By.xpath("//td[text()= 'Retype password']/following-sibling::td[2]/input[@type='password']")).sendKeys("Jack123");
		driver.findElement(By.xpath("//td[text() = 'Alternate Email Address']/following-sibling::td[2]/input[@type='text']")).sendKeys("Jack123@yahoo.com");
		
		// driver.findElement(By.xpath("//td[text()= 'Mobile
		// No.']/following-sibling::td[2]/div[@id='country_id']")).sendKeys("213, 213");
		WebElement dateOfBirth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		Select birthday = new Select(dateOfBirth);
		birthday.selectByIndex(5);
		WebElement birthMonth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		Select birthdayMonth = new Select(birthMonth);
		birthdayMonth.selectByVisibleText("NOV");
		WebElement birthYear = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		Select birthdayYear = new Select(birthYear);
		birthdayYear.selectByValue("2004");
		driver.findElement(By.xpath("//td[text() = 'Gender']/following-sibling::td[2]/input[@value ='f']")).click();
		driver.findElement(By.xpath("//input[@type ='radio'and @value = 'f']")).click();
		WebElement countryList = driver.findElement(By.id("country"));
		Select countryDropdown = new Select(countryList);
		countryDropdown.selectByVisibleText("Australia");
		WebElement city = driver.findElement(By.xpath("//select[contains(@name, 'city')]"));
		Select cityDropdown = new Select(city);
		cityDropdown.selectByVisibleText("Bhopal");

	}

}
