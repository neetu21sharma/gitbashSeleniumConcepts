package browsertest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class MultiBrowserTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		String browserType = "Chrome";
				
			WebDriver driver = utilities.HandlingCommonActions.selectBrowser(browserType);
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/");
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
			
			System.out.println("Contact Information");
			driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Faith");
			driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Faith");
			driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("566-434-0973");
			driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys("Faith123");
			
			System.out.println("Mailing Info");
			
			driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("2105 Mads Lane");
			driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Thornton");
			driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("303455");
			 WebElement countryDropdown = driver.findElement(By.name("country"));
			 Select countryName = new Select(countryDropdown);
			 countryName.selectByValue("ARGENTINA");
				
				  List<WebElement> allOptions = countryName.getOptions(); 
				  int size = allOptions.size();
				 		
			 //int size = countryName.getOptions().size();
			
			//This will give the total count of all the country dropdown
			System.out.println("Total no of options present in this dropdown" + size);
			
			 					 
			//this will count and print the text of all the country dropdown
		  for(int i = 0; i<size; i++) 
		  {
		  System.out.println(allOptions.get(i).getText()); 
		  }
				  	
		  //this will print the countries in reverse order
		Thread.sleep(4000);
		for(int i = size-1; i>0; i--)
		{
  			System.out.println(allOptions.get(i).getText());
		}
		
		for(WebElement options: allOptions)
		{		 System.out.println(options.getText());
		 	
		}
			
			
		
	}

	
		
		
		
	}



