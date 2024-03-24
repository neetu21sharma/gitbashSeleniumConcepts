package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.delta.com/");
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='calenderReturnSpan calendar-placeholder']")).click();
		System.out.print("Clicked");
		driver.findElement(By.xpath("//a[text() = '30']")).click();
		System.out.println("Clicked");
		driver.findElement(By.xpath("//button[@class = 'donebutton']")).click();
		
		//*[@id="calReturnLabelCont"]/span[2]
		

	}

}
