package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCommonActions {

	static WebDriver driver;
	

	public static WebDriver selectBrowser(String browserType)
		{
		WebDriverManager.chromedriver().setup();
			if (browserType.equalsIgnoreCase("Chrome"))
			{
				
				driver = new ChromeDriver();
			}
			else if (browserType.equalsIgnoreCase("FireFox"))
			{
		
				driver = new FirefoxDriver();
			}
			else if (browserType.equalsIgnoreCase("IE"))
			{
				driver = new InternetExplorerDriver();
		    }
			else 
			{
				driver = new EdgeDriver();
			}
			return driver;
}
	public static WebDriver maximize()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	
	
	public static WebDriver tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
	driver.quit();
	return driver;
	

}
}