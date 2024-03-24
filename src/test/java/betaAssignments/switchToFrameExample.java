package betaAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class switchToFrameExample {

	public static void main(String[] args) {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver = utilities.HandlingCommonActions.maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-bottom");
	
				
		
		

	}

}
