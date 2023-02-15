package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) //throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	//	Thread.sleep(5000);
	
	
	}
	

}
