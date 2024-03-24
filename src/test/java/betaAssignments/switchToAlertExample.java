package betaAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class switchToAlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
