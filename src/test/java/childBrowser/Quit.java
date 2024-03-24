package childBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Difference betweeen quit and close
//Close - closed the window that has the focus - means the parent window and not the sub window
//Quit - Close all the windows.Parent and the child window
public class Quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
	}

}
