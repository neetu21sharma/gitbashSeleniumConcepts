package locatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://DemoWebShop.com");
		WebElement countryDropdown = driver.findElement(By.name("country"));
		//When there is a multiselect dropdown you have to select each individually by giving index
		//an index. You have to validate that the first option matches and then you can get sekect all
		Select sel = new Select(countryDropdown);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		
		System.out.println(sel.getFirstSelectedOption());
		
		//Display the list of all the WebElements by using the get() method 
		  List<WebElement> selOptions = sel.getAllSelectedOptions();
		  for (WebElement options : selOptions) {
			  
			  System.out.println(options.getText());
			
		}
		  //You can deselect all but you can't select all the options at once without slecting them individually
		  sel.deselectAll();
		 
		 
		 
		 
	
	}

	
}
