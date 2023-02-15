package parellelTesting;




	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.*;

	public class class1 {

		@Test
		public void openFlipkart()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   WebDriver driver= new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   driver.get("https://www.flipkart.com");
		}
		
		@Test
		public void openAmazon()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   WebDriver driver= new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   driver.get("https://www.amazon.in");
		}
		
		@Test
		public void openFacebook()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   WebDriver driver= new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   driver.get("https://www.facebook.com");
		}
	
}