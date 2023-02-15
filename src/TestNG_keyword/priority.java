package TestNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {

	
		@Test(priority=2)
		public void TC1()
		{
			Reporter.log("Test case 1 is running",true);
		}
		@Test(priority=-2)
		public void TC2()
		{
			Reporter.log("Test case 2 is running",true);
		}
		@Test(priority=0)
		public void TC3()
		{
			Reporter.log("Test case 3 is running",true);
		}
		@Test(priority=-1)
		public void TC4()
		{
			Reporter.log("Test case 4 is running",true);
		}
		@Test(priority=-3)
		public void TC5()
		{
			Reporter.log("Test case 5 is running",true);
		}
}
