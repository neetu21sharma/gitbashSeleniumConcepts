package betaAssignments;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScheduleAppointmentTest {
	
	
	
	WebDriver driver;

	@Test

	public void bookAppointmentTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://96.84.175.78"
				+ "/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("ria1");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Ria12345");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		String actual = driver.findElement(By.className("panel-title")).getText().trim();
		
		String expected = "Patient Portal";
		Assert.assertEquals(actual, expected);
		moduleNavigation("Schedule Appointment");

		driver.findElement(By.xpath("//input[@value = 'Create new appointment']")).click();

		// selectDoctor("Pediatrician","Beth");
		String ExpectedDoctor = "Sophia Rich";
		selectDoctor("Cardiologist", ExpectedDoctor);

		driver.switchTo().frame("myframe");

		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  
		  Thread.sleep(3000);
		  
		  List<WebElement> datesList =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		  Random rand = new Random();
		  int index = rand.nextInt(datesList.size());
		  datesList.get(index).click();
		 
	
		WebElement appt = driver.findElement(By.id("time"));
		Select scheduleTime = new Select(appt);
		scheduleTime.selectByVisibleText("10Am");
		driver.findElement(By.xpath("//button[@id = 'ChangeHeatName']")).click();

		driver.switchTo().defaultContent();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sym")))
				.sendKeys("Cold" + " , " + "Cough" + " , " + "Fever");
		driver.findElement(By.xpath("//input[@value ='Submit']")).click();
	}
	

	public void moduleNavigation(String moduleName) {

		driver.findElement(By.xpath("//span[contains(text(), '" + moduleName + "')]")).click();
	}

	public void selectDoctor(String departmentName, String doctorName)

	{
		driver.findElement(By.xpath("//p[text()='Description:" + departmentName + "']/parent::div/preceding-sibling::"
				+ "h4[text()='Dr." + doctorName + "']/ancestor::ul/following-sibling::button")).click();

	}

}
