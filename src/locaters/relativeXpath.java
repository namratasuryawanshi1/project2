package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//xpath with attribute
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[@title=\"SELENIUM WEBDRIVER TUTORIAL - Learn Selenium Automation with Java - FULL COURSE\"]")).click();
		//span[@title="SELENIUM WEBDRIVER TUTORIAL - Learn Selenium Automation with Java - FULL COURSE"
		Thread.sleep(50000);
		
		
		
			
				
		
	}

}
