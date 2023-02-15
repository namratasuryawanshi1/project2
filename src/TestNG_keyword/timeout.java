package TestNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut=2000)
	public void TC1()
	{
		Reporter.log("Test case 1 is running",true);
	}
	
	@Test(timeOut=1000)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Test case 2 is running",true);
	}
}


