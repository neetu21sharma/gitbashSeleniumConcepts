package betaAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDay2 {

	public static void main(String[] args) throws InterruptedException {
		String browserType = "Chrome";
		WebDriver driver;
		driver = utilities.HandlingCommonActions.selectBrowser(browserType);
		driver = utilities.HandlingCommonActions.maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("ria1");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Ria12345");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Schedule Appointment']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//input[@value ='Create new appointment']")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[6]/ul[@class='list-inline list-users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr/td[6]/button[text() = 'Book Appointment']")).click();
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		//handling iframe as a webelement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='myframe']"));
		driver.switchTo().frame(frameElement);
		// - //*selects all elements in the doc
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() ='22']")).click();
		WebElement Appt = driver.findElement(By.id("time"));
		Select scheduleTime = new Select(Appt);
		scheduleTime.selectByValue("10Am");
		
	
		
		
		
		
		/*
		 * String apptDate = "16"; String apptMonth = "Nov"; String apptYear = "2024";
		 * 
		 * String month = driver.findElement(By.
		 * xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//div[@class='ui-datepicker-title']/span[1]"
		 * )).getText();
		 * driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']"))
		 * .click();
		 */
		//select[@id='time']
		//
		
		
		/*
		 * driver.findElement(By.xpath(
		 * "//input[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]")).isEnabled();
		 * #ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(6)
		 * 
		 * //input[@id='datepicker']
		 * 
		 * 
		 * 
		 * /html/body/div[2]/table/tbody/tr[5]/td[6]
		 * //span[@class='ui-datepicker-month'] //input[@id='datepicker']
		 */
				
				
		//driver.findElement(By.xpath("//input[@class ='hasDatepicker']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='ui-datepicker-div']")).click();
			//	+ "/table/tbody/tr[5]/td[6]")).click();
		
		//tbody/tr/td[6]/button[1]
		//tbody/tr/td[6]/button[1]
		//input[@id='datepicker']
		//span[@class='ui-datepicker-month']
		//a[@class='ui-state-default ui-state-hover']
		//input[@id='datepicker']
		
		//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[6]
		
		
		//input[@id='datepicker']
		
		///html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[3]/button
		
		
		//input[@id = 'username']
		//input[@id = 'password'
		//input[@value='Sign In']
		
		//span[normalize-space()='Schedule Appointment']
		
		///html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[6]/ul/li/h4
		//table/tbody/tr/td[6]/ul/li/h4
	}

}
