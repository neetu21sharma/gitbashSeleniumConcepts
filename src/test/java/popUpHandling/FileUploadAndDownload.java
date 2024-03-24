package popUpHandling;

//When you want to upload and diwnload a while
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//make sure for uplaoding a file make sure element has to have an input tag
public class FileUploadAndDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.monster.com/");
		//driver.findElement(By.xpath("xpath of the fileupload tab")
		//driver.findElement(By.id("file-upload"))args.sendKeys("file along with the path");
		
		//For file download
		driver.get("https://the-internet.herokuapp.com/download");
		Thread.sleep(3000);
		//file to be downloaded
		driver.findElement(By.xpath("//a[text() = 'LambdaTest.txt']")).click();
				//<a href="download/LambdaTest.txt">LambdaTest.txt</a>
		System.out.println("File downloaded successfully");
	}

}
