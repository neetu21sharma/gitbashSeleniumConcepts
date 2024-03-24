package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String title = driver.getTitle();                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		Thread.sleep(3000);
		System.out.println(title);
		driver.close();
		
		
	}
}


/*
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class TestChromeBrowser {
 * 
 * 
 * public static void main(String[] args) throws InterruptedException { //
 * //Compile time polymorphism //ChromeDriver driver = new ChromeDriver();
 * 
 * //or runtime polymorphism
 * 
 * WebDriver driver;
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("https://google.com"); String title = driver.getTitle();
 * System.out.println(title); Thread.sleep(3000); driver.close();
 * 
 * System.out.println("----------------------------------------");
 * 
 * 
 * 
 * driver = new FirefoxDriver(); driver.manage().window().maximize();
 * driver.get("https://Rediff.com"); System.out.println(driver.getTitle());
 * Thread.sleep(3000); driver.close();
 * 
 * 
 * 
 * } }
 */