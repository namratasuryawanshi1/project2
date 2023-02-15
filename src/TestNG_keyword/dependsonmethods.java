package TestNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods {
	@Test(dependsOnMethods= {"login","cart"})
	public void Buy()
	{
		Reporter.log("Buying new stuff",true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void cart()
	{
		Reporter.log("Adding some stuff to cart",true);
	}
	
	@Test
	public void login()
	{
		Reporter.log("login into application",true);
	}
	
	@Test(priority=1)
	public void logout()
	{
		Reporter.log("Logout from the application",true);
	}
}


