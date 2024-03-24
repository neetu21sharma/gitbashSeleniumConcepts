package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilities.ExcelUtils;

public class DataDriven {
	WebDriver driver;	
	@BeforeMethod
	public void setUp()
	{
	driver = utilities.HandlingCommonActions.selectBrowser("Chrome");
	driver = utilities.HandlingCommonActions.maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	public void tearDown() throws InterruptedException
	{
		driver = utilities.HandlingCommonActions.tearDown();
	}
	@DataProvider(name = "testExcelData")
	public Object[][]testExcelData()
	{
		ExcelUtils xl = new ExcelUtils("testExcelData/testExcelData.xlsx");
		int rows = xl.getRowCount(0);
		Object[][]data = new Object[rows][3];
		for (int i = 0; i<rows; i++)
		{
			data[i][0]= xl.getCellData(0, i, 0);
			data[i][1] = xl.getCellData(0, i, 1);
		}
		return data;
		
	}
}
