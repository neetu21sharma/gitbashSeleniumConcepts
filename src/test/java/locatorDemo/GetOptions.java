package locatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	
	public static void main(String[] args) throws InterruptedException {
	  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(countryDropdown);
		
		List<WebElement> allOptions = sel.getOptions();
		int size = allOptions.size(); // This will give the total count of all the country
		// dropdown
		System.out.println("Total no of options present in this dropdown" + size);

		// this will count and print the text of all the country dropdown
		for (int i = 0; i < size; i++) {
			System.out.println(allOptions.get(i).getText());
		}

		// this will print the countries in reverse order Thread.sleep(4000);
		for (int i = size - 1; i > 0; i--) {
			System.out.println(allOptions.get(i).getText());
		}

		for (WebElement options : allOptions) {
			System.out.println(options.getText());

		}

	}

}

