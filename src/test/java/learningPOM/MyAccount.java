package learningPOM;

import org.openqa.selenium.WebDriver;

public class MyAccount {
	
	WebDriver driver;

	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyLoginStatus() {
		String loginPageTitle = driver.getTitle();

		if (loginPageTitle.equals("My Account")) {
			System.out.println("Login is sucessful");
		} else {
			System.out.println("Please check your credentials");
		
		}
	}


}
