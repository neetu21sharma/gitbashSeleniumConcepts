package browsertest;

import org.openqa.selenium.WebDriver;


public class BrowserNavigation {
	

	public static void main(String[] args) throws InterruptedException {
		
		String browserType = "FireFox";
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser(browserType);
		/*
		 * WebDriver driver; driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
		driver.navigate().to("https:\\www.amazon.com");
		Thread.sleep(2000);
	String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		driver.navigate().back();
		//driver.findElement(By.xpath("//i[@class ='hm-icon nav-sprite']")).click();
		//driver.findElement(By.xpath("//button[@class='a-button-text']"));
		
		 driver.navigate().forward();
		  System.out.println("refresh----------------------");
		 driver.navigate().refresh();
		 driver.close();
		 
		
		
		
		

	}

}
