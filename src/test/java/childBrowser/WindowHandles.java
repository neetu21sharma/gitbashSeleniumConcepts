package childBrowser;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		String browserType = "Chrome";
		WebDriver driver;
		driver = utilities.HandlingCommonActions.selectBrowser(browserType);
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		Thread.sleep(4000);
		
		
	}

}
