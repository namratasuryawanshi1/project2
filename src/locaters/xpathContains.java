package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//contains with atribute
		
		driver.findElement(By.xpath("//input[contains(@id,\"em\")]")).sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,\"pass\")]")).sendKeys("1234");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),\"About\")]")).click();
		Thread.sleep(2000);
		
	}

}
//a[contains(@title,"Read")]