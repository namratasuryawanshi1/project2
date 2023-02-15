package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args)throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		

	}

}
