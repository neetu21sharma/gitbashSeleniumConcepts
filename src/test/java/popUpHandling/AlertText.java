package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Test Selenium Automation");
		driver.switchTo().alert().accept();
		

	}

}
