package synchronization;

//Synchronization is a process of matching the tool speed(eclipse+selenium) with the application(any web application under test)

//in order to achieve synchronization we use one of the following wait statements in Selenium

//1.Implicit Wait
//2. Explicit Wait
//3. Thread.sleep
//4. Fluent Wait

/*Implicit Wait 
1. It is a wait statement written globally in the code
2. The wait period mentioned in the implicit wait is applicable to all the elements located using driver.findBy
3. The wait period can be from nano seconds to days but maximum wait for any web application should be considered only in seconds
4. Even after the specified time if the element is not appearing on a webpage then it will throw"no such element" exception

Explicit Wait
1. It is a wait written for individual element
2. We need to create an Object of WebDriver wait to achieve explicit wait
3. We need to specify the condition for each element
4. Even after the specified time if the element is not appearing on a webpage then it will throw "time out exception"*/

//Thread.sleep - Forcefully stop the execution

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitFunction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Sam");
		
	}

}
