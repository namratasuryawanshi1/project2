package parellelTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

//cross browser testing
public class testClass1 
{
	@Parameters("Browser")
	@Test
	public void TC1(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Namrata\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Namrata\\Desktop\\selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com");
	}
}
