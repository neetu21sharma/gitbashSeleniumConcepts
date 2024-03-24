package betaAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		// find the element using starts-with and contains
		driver.findElement(By.xpath("//input[starts-with(@name, 'nam')]")).sendKeys("Neetu");
		driver.findElement(By.xpath("//input[contains(@name, 'login')]")).sendKeys("Neets123");

		// finding the element locator using Axes Locator
		driver.findElement(By.xpath("//td[text() = 'Password']/following-sibling::td[2]/input[@type='password']"))
				.sendKeys("Neetu123!!");
		driver.findElement(By.xpath("//td[text()= 'Retype password']/following-sibling::td[2]/input[@type='password']"))
				.sendKeys("Neetu123");
		
		driver.findElement(
				By.xpath("//td[text() = 'Alternate Email Address']/following-sibling::td[2]/input[@type='text']"))
				.sendKeys("Neetu123");
		// driver.findElement(By.xpath("//td[text()= 'Mobile
		// No.']/following-sibling::td[2]")).sendKeys("3332223450");
		driver.findElement(By.xpath("//div[@id ='country_id']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//ul/li[text() ='United Kingdom (+44)']")).click();
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("4014565678");

		// finding the element using contains()
		WebElement dateOfBirth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		Select birthday = new Select(dateOfBirth);
		birthday.selectByIndex(5);

		WebElement birthMonth = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		Select birthdayMonth = new Select(birthMonth);
		birthdayMonth.selectByVisibleText("NOV");

		WebElement birthYear = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		Select birthdayYear = new Select(birthYear);
		birthdayYear.selectByValue("2004");

		// Using following and text()
		driver.findElement(By.xpath("//td[text() = 'Gender']/following-sibling::td[2]/input[@value ='f']")).click();

		// text with space(like trailing spaces) in beginning and end using normalize
		// space function

		driver.findElement(By.xpath("//input[normalize-space(text()) ='Gender']"));
		// text with space in between
		driver.findElement(By.xpath("//input[text()[normalize-space() = 'Gender']"));

		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("3034565678");

		// find element by using position()

		/*
		 * WebElement countryDropdown =
		 * driver.findElement(By.xpath("//select[@id='country']/option[position() =20]")
		 * );
		 * 
		 * find elemnt using last() Example: //country[last()]
		 * 
		 * WebElement countryDropdown =
		 * driver.findElement(By.xpath("//select[@id='country']")); Select dropdown =
		 * new Select(countryDropdown); dropdown.selectByIndex(20);
		 */

		/*
		 * # Find the element you are interested in element =
		 * driver.find_element_by_xpath("//div[@class='example']")
		 * 
		 * # Get the position of the element among its siblings position =
		 * element.get_attribute("position") print("Position of the element:", position)
		 */

	}

}
