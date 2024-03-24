package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box1")); 
		WebElement target = driver.findElement(By.id("box106"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(target, source).build().perform();
	

	}

}
