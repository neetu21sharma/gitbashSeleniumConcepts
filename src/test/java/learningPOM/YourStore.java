package learningPOM;// session 23/24 JB
//use new with return when a method is returning more than one value. It is not just returning one variable but it is returning whole
//page that has multiple methods

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourStore {
	WebDriver driver;

	public YourStore(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMyAccountIcon() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'fa fa-user']")).click();
		Thread.sleep(2000);
	}
	
	public RegisterAccount clickOnRegisterLink()
	{
		driver.findElement(By.xpath("//li[1]/a[text() ='Register']")).click();
		return new RegisterAccount(driver);
		
	}

	/*
	 * public AccountLogin clickOnLoginLink() {
	 * driver.findElement(By.xpath("//a[text()= 'Login']")).click(); return new
	 * AccountLogin(driver); }
	 */
	
}
