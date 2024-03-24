package learningPOM;

import org.openqa.selenium.WebDriver;

public class NewAccount {
	WebDriver driver;
	public NewAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyRegistration()
	{
				
		String pageTitle = driver.getTitle();
		
				
		if (pageTitle.equals("Your Account Has Been Created!"))
		{
			System.out.println ("The registration is succesful");
		}
		else{
		
			System.out.println("The Registration failed");
		}
		
	
	}
}
