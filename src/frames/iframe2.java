
//homework assignment

package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body//input")).sendKeys("selenium");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement a=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		//a.click();
				
		Select s=new Select(a);
		s.selectByIndex(2);
		driver.switchTo().defaultContent();
		
		
		
	}

}
