package iframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFrameByElement
{
	public static void main(String[] args) {
	
WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
driver.get("file:///C:/Users/sande/QAH2K1/BATCH27%20(1)/SELENIUM/SRC/iframeex.html");
//Switching the frame locating iframe as a element
WebElement frameElement = driver.findElement(By.xpath("//iframe[@title = 'Login']"));
driver.switchTo().frame(frameElement);
driver.findElement(By.id("email")).sendKeys("nsharma");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Click to Navigate to google")).click();
	

}
}