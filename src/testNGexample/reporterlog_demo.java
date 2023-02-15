package testNGexample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterlog_demo {

	
		@Test
		public void openFlipkart()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   WebDriver driver= new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   Reporter.log("open flipkart application",true);
			   
			   driver.get("https://www.flipkart.com");
		}
		
		@Test
		public void openAmazon()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   WebDriver driver= new ChromeDriver();
			 
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   Reporter.log("open amazon application");
			   driver.get("https://www.amazon.in");

	}

}
