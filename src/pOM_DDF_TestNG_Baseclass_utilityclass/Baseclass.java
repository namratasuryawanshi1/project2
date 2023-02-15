package pOM_DDF_TestNG_Baseclass_utilityclass;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Baseclass 
	{
		//Base class contains all mandatory code needed for each and every test case execution
		WebDriver driver;
		public void configureBrowser()
		{
			//configure browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			   
			   //create webdriver object
			   
			   driver= new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   driver.manage().window().maximize();
			   
			//open application
			   driver.get("https://www.flipkart.com");
		}

	}
	