package popUpHandling;
//Lecture - 25
//There are different types of popups

/*1. Alert and Confirmation pop up - also called as JAva script popup - u cananot move or inspect thsi popup
 accept/dismiss/get the text. This popup generally displayed whenever certain pre conndition doesnot met
2. Windows Authentication - Selenium doesnot support this windows Auth directly
(b)We cannot inspect or move this popup
(c)We can append the username and password directly to the url
3. File Upload Popup - you can upload the file
(a) The element on which you are trying to upload a file should be having input tag
(b)We can inspect the Popup. We can use send keys method to upload the file
4. File download pop up - We can inspect popup
(a) It would be under the link tag where clicking on it will download a file
5. Hidden Division Popup - 
Calender is the example which best suits hidden division popup. It will be hidden behind another element and mostly it would be developed using
using a div tag. We can inpect the pop up and we can use the regular send keys method to handle it
Generally the element will be hidden inside a div tag which we should click to bring it up focus focus
6. Child Browser popup
*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {
	
	//We cannot move the popup.
	//We cannot Inspect the popup
	//popup only has ok and cancel

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		 
		 
		
		 
	}

}
