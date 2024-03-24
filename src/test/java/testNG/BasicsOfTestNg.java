package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BasicsOfTestNg {
	
	@BeforeClass
	public void check()
	{
	System.out.println("check");
	}
	@BeforeMethod
	public void Before()
	{
	System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterM()
	{
		System.out.println("After Method");
	}
	@Test
	public void login()
	{
		System.out.println("This will login to application");
	}
	@Test
public void add()
{
	System.out.println("add");
}
@Test
public void subtract()
{
	System.out.println("This will subtarct");
}
@AfterClass
public void end()
{
	System.out.println("This is the end");
}

}
