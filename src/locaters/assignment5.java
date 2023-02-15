package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(@href,\"/gp/bestsellers/?ref_=nav_cs_bestsellers\")]")).click();
	
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//a[contains(text(),\"Electronics\")]")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
		
		//a[contains(@href,"/gp/bestsellers/?ref_=nav_cs_bestsellers")]
	}

}
