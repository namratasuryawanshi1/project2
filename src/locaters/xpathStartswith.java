package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathStartswith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("www.youtube.com");
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@name,\"search\")]"));
		ele.sendKeys("yuvaansh");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[starts-with(@id,\"search\")]")).click();
		Thread.sleep(1000);
		
			
		
	}

}
