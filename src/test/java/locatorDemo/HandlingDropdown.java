package locatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//if the locator has the same value for two web elements then the program will execute. You will not see any warnings or errors. It will just
//if the identified element matching with the duplicate one, it will always go to the first matching element. To avoid this kind of situation you can try CSS selector

//For the dropdown use the select class
//Create an object of a Select clas 
//Select (aliasname = new Select(//pass the argument //this is where the exception cases of constructor falls in)
//when you don't want the default constructor you pass the parameter)
//you need to retreive the value of the webelement that you can pass as parameter so create a string varible of the type webelement
//WebElement country1 = driver.findElement(By.name("country");
//Select country = new Select(country1);
//country1.selectBy
//You can either selectbyindex(integer)
//selectByOptionValue(String vAlue)
//SelectByVisiblestring
public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Jacky");
		driver.findElement(By.name("phone")).sendKeys("425-454-7631");
		driver.findElement(By.id("userName")).sendKeys("Test123");
		driver.findElement(By.name("address1")).sendKeys("432 - Mariposan Road");
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Sanjose");
		driver.findElement(By.name("state")).sendKeys("California");
		driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("80023");

		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select country1 = new Select(countryDropdown);
		country1.selectByIndex(2);
		// .selectByValue("ANTARCTICA");
		driver.findElement(By.id("email")).sendKeys("test1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("45634");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("45634");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		String title = driver.getTitle();
		if (title.equals("Register: Mercury Tours")) {
			System.out.println("Login successful");
		} else
			System.out.println("Login failed");
		driver.findElement(By.linkText("Flights")).click();
		String titlePage = driver.getTitle();
		if (titlePage.equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Page Landing is successful");
		} else
			System.out.print("Page is unsuccessful");

		// driver.findElement(By.xpath("//input[@type = 'radio' and @name='tripType' and
		// @value= 'roundtrip']")).click();
		driver.findElement(By.xpath("//input[@type='radio'and @name ='tripType' and @value = 'oneway']")).click();
		WebElement passCt = driver.findElement(By.name("passCount"));
		Select passct1 = new Select(passCt);
		passct1.selectByValue("3");

		WebElement departfrom = driver.findElement(By.name("fromPort"));
		Select depfrom = new Select(departfrom);
		depfrom.selectByIndex(1);

		WebElement month = driver.findElement(By.name("fromMonth"));
		Select frommnth = new Select(month);
		frommnth.selectByVisibleText("February");

		WebElement day = driver.findElement(By.name("fromDay"));
		Select date = new Select(day);
		date.selectByValue("8");

		WebElement Arrivingday = driver.findElement(By.name("toPort"));
		Select arriving = new Select(Arrivingday);
		arriving.selectByValue("Seattle");

		WebElement returndate = driver.findElement(By.name("toMonth"));
		Select departmonth = new Select(returndate);
		departmonth.selectByValue("3");

		WebElement departDate = driver.findElement(By.name("toDay"));
		Select depdate = new Select(departDate);
		depdate.selectByValue("14");

		System.out.println("Preferences");

		driver.findElement(By.xpath("//input[@name='servClass' and @ value = 'Business']")).click();

		WebElement airln = driver.findElement(By.xpath("//select[@name = 'airline']"));
		Select air = new Select(airln);
		air.selectByVisibleText("Blue Skies Airlines");

		/*
		 * driver.get("https://demo.guru99.com/test/newtours/login.php");
		 * driver.findElement(By.name("userName")).sendKeys("test123@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("4563");
		 * driver.findElement(By.name("submit")).click(); driver.getCurrentUrl();
		 * System.out.println(title);
		 */
	}

}
