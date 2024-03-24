package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//when you have the popup where you have to enter username and passwird before u can proceed so
//you can automate this by appending username and password in the url itsel
//https://username:password@website
public class WindowsAuth {

	public static void main(String[] args) {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https//admin:admin@the-internet-herokupp.com/basic_auth");
		

	}

}
