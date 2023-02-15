package testNGexample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG_testClass {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://www.flipkart.com");

	}
	
	

}
