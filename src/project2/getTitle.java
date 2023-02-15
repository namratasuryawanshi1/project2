package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class getTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		String actualResult=driver.getTitle();
		
		if(actualResult.equalsIgnoreCase("google"))
		{
			System.out.println("Test case Passed");
			
		}
		else
		{
			System.out.println("Test case failed");
		}
		}
	
	 
}
