package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathText {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/");
					Thread.sleep(2000);
					
					//xpath with attribute
					
					driver.findElement(By.xpath("//a[text()=\"Messenger\"]")).click();
					driver.navigate().back();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//a[text()=\"Facebook Lite\"]")).click();
					
					Thread.sleep(2000);
					driver.close();
					
					
					driver.findElement(By.xpath("//span[@title=\"SELENIUM WEBDRIVER TUTORIAL - Learn Selenium Automation with Java - FULL COURSE\"]")).click();
					//span[@title="SELENIUM WEBDRIVER TUTORIAL - Learn Selenium Automation with Java - FULL COURSE"
					Thread.sleep(50000);
					

	}

}
