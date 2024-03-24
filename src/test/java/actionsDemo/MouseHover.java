package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	//how to do use a mousehover on an application 
		//you use Actions class by using build and performs methods
		

			public static void main(String[] args) throws InterruptedException {
				String BrowserType = "Chrome";
				WebDriver driver = utilities.HandlingCommonActions.selectBrowser(BrowserType);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.delta.com/");
				WebElement element = driver.findElement(By.xpath("//a[@id= 'headSectab1']"));
				Actions action = new Actions(driver);
				action.moveToElement(element).build().perform();
			    driver.findElement(By.xpath("//a[@id = 'secondary-static-link-0']")).click();
			    action.dragAndDrop(element, element).build().perform();

			}

	}


