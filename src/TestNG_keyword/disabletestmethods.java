package TestNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disabletestmethods {
	@Test()
	public void TC1()
	{
		Reporter.log("Test case 1 is running",true);
	}
	@Test()
	public void TC2()
	{
		Reporter.log("Test case 2 is running",true);
	}
	@Test()
	public void TC3()
	{
		Reporter.log("Test case 3 is running",true);
	}
	@Test()
	public void TC4()
	{
		Reporter.log("Test case 4 is running",true);
	}
	@Test()
	public void TC5()
	{
		Reporter.log("Test case 5 is running",true);
	}
}

