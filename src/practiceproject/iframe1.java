package practiceproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("selenium");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		Thread.sleep(2000);
		Select s=new Select(ele);
	
		s.selectByIndex(2);
		driver.switchTo().parentFrame();
		
	}

}
