package demoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebShop {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.janbaskdemo.com/");
		driver.findElement(By.xpath("//i[@class = 'fa fa-user']")).click();
	
		
		
	}

}
