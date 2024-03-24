package iframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Handling the element which is present inside an iFrame. IFrame is nothing but a place in the webpage where webpage will
//be loaded. An HTML inside the main html page

//There are 3 different ways to deal with iframe elements by taking the control from main page to iframe

//1. Using index - usually not recommended
//2. Using name or id
//3/ Handling iframe as webelement
//When you have another page or HTML inside the main page. It is known as Iframe. Always click oustside and right click
//notice that it has Fraome Source that means that page is inside the iFrame
public class iframeHandlingwithIndex {

	public static void main(String[] args) {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home");

		//switching to frame using index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@class='header_hamburger']")).click();
		//Switch to defaault means the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Click here to Navigate to Google"));

	}

}
