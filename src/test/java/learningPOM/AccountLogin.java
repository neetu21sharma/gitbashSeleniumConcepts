package learningPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogin {
	WebDriver driver;
	

	public AccountLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmail() {

		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("Sam123@yahoo.com");
	}

	public void enterPassword() {
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("samtest");
	}

	public  MyAccount clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		return new MyAccount(driver);
	}
}
