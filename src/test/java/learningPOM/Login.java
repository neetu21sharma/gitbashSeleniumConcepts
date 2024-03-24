package learningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open the Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Enter the url
		driver.get("http://janbaskdemo.com/");
		
	//click on My account icon
		
		YourStore ys = new YourStore(driver);
		ys.clickOnMyAccountIcon();
		/*
		 * AccountLogin login = ys.clickOnLoginLink();
		 * 
		 * //click on loginLink login = new AccountLogin(driver); //Enter correct email
		 * login.enterEmail(); //Enter correct password login.enterPassword(); //Click
		 * on Login button MyAccount mAcct = login.clickOnLoginButton();
		 * 
		 * //Verify
		 * MyAccount mAcct= new MyAccount(driver); 
		 * mAcct.verifyLoginStatus();
		 * 
		 * //Close the browser
		 * 
		 * driver.close();
		 */
		
		RegisterAccount rs = ys.clickOnRegisterLink();
		
		rs = new RegisterAccount(driver);
		rs.enterFirstName();
		rs.enterLastName();
		rs.enterEmail();
		rs.enterPhone();
		rs.selectCountry();
		rs.enterPassword();
		rs.confirmPassword();
		rs.newsLetter();
		rs.selectSubscription();
		rs.checkBox();
		rs.conRegistration();
		
		NewAccount reg = new NewAccount(driver);
		
		reg.verifyRegistration();
		
		

	}

}
