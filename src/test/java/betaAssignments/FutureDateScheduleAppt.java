package betaAssignments;

	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.List;
	import java.util.Random;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class FutureDateScheduleAppt {
		
		int i ;
		WebDriver driver ;
		@Test
		public void bookAppointmentTests()
		{
			i=10;
			//System.setProperty("webdriver.chrome.driver","path to the chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");

			//Login
			driver.findElement(By.id("username")).sendKeys("ria1");
			driver.findElement(By.id("password")).sendKeys("Ria12345");
			driver.findElement(By.name("submit")).click();

			String actual = driver.findElement(By.className("panel-title")).getText().trim();
			String expected ="Patient Portal";
			Assert.assertEquals(actual, expected);
			moduleNavigation("Schedule Appointment");

			///Adding the logic 
			//@author 

			driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();

			String expectedDoctor ="Beth";
			selectDoctor("Pediatrician",expectedDoctor);

			driver.switchTo().frame("myframe");

			driver.findElement(By.id("datepicker")).click();
			
			
			
			String futureDate = getFutureDate(60,"dd/MMMM/YYYY");
			String[] futureDateArr = futureDate.split("/");
			String expectedDay =  futureDateArr[0];//16
			String expectedMonth= futureDateArr[1];//April
			String expectedYear= futureDateArr[2];//2024
			
			String displayedYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().trim();//2024
			String displayedMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().trim();//February
			
			while((Integer.parseInt(displayedYear))!=(Integer.parseInt(expectedYear)))
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				displayedYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			}
			while(!(displayedMonth.equals(expectedMonth)))
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				displayedMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			}
			
			driver.findElement(By.linkText(expectedDay)).click();
			
			String expectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
			
			//16/April/2024
			

//			driver.findElement(By.xpath("//span[text()='Next']")).click();
	//
//			List<WebElement> datesList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
//			Random rand = new Random();
//			int index = rand.nextInt(datesList.size());
//			datesList.get(index).click();
	//
	 		 

			Select timeSelect = new Select(driver.findElement(By.id("time")));
			String expectedTime = "10Am";
			timeSelect.selectByVisibleText(expectedTime);

			driver.findElement(By.id("ChangeHeatName")).click();
			driver.switchTo().defaultContent();
			String expectedAppointment = generateRandomString();
			driver.findElement(By.id("sym")).sendKeys(expectedAppointment);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			String actualDate = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[1]")).getText();
			String actualTime = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]")).getText();
			String actualAppointment = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[3]")).getText();
			String actualDoctor = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[4]")).getText();

			boolean result = false;
			if((actualDate.equals(expectedDate))&&(actualTime.equals(expectedTime))&&
					(actualAppointment.equals(expectedAppointment))&&(actualDoctor.equals(expectedDoctor)))
			{
					result = true;
			}
			Assert.assertTrue(result);

		}

		public void moduleNavigation(String moduleName)
		{
			System.out.println(i);
			driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();
		}
		public void selectDoctor(String departmentName,String doctorName)
		{
			driver.findElement(By.xpath("//p[text()='Description:"+departmentName+"']/parent::div/preceding-sibling::"
					+ "h4[text()='Dr."+doctorName+"']/ancestor::ul/following-sibling::button")).click();

		}
		public String generateRandomString()
		{
			/*
			 * Generate the Random Email ID
			 */
			Random rand = new Random();
			int randomNumber = 1+rand.nextInt(100);//0 to 99
			//System.out.println("Random number:" + randomNumber);

			int upperCase = 65+rand.nextInt(26);//0 to 25
			char upperCaseChar = (char) upperCase;
			//System.out.println("UpperCase Char:::" + upperCaseChar);


			int lowerCase = 97+rand.nextInt(26);//0 to 25
			char lowerCaseChar = (char) lowerCase;
			//System.out.println("lowerCase Char:::" + lowerCaseChar);


			String randomString="AutoTester"+upperCaseChar+lowerCaseChar+randomNumber;
			System.out.println("randomString:::  " + randomString);

			return randomString;
		}
		public static String getFutureDate(int noofDays,String dateFormat)
		{
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, noofDays);
			Date d = cal.getTime();
			System.out.println(cal.getTime());
			SimpleDateFormat sdfObj = new SimpleDateFormat(dateFormat);
			String s = sdfObj.format(d);
			System.out.println(s);
			return s;
//			String dateArr[] = s.split("/");
//			System.out.println("DD::" + dateArr[0]);
//			System.out.println("MMMM::" + dateArr[1]);
//			System.out.println("YYYY::" + dateArr[2]);
		}
	}
	


