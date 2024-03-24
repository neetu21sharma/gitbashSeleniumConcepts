package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("//a[text() = 'Sell']"));
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		
		

	}

}
