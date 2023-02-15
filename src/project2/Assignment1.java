package project2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//step 1
		
		System.out.println(driver.getTitle());
		String actualResult=driver.getTitle();
		
		if(actualResult.equalsIgnoreCase("google"))
		{ 
			System.out.println("Test is passed");
		}
		
		else
		{
			System.out.println("Test is failed");//step 2
		}
			Thread.sleep(2000);
			
			Dimension d=new Dimension(700,700);
			driver.manage().window().setSize(d);//step3
			Thread.sleep(2000);
			
			driver.manage().window().minimize();//step 4
			Thread.sleep(2000);
			
			driver.manage().window().maximize();//step 5
			Thread.sleep(2000);
			
			driver.close();//step 6
					
		
		
		
		
	}

}
