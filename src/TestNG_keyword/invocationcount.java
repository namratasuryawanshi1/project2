package TestNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {

	@Test(invocationCount=3,priority=1)
	public void TC1()
	{
		Reporter.log("Test case 1 is running",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("Test case 2 is running",true);
	}
}

	


