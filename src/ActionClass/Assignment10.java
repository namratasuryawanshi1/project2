package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		act.moveToElement(ele1).perform();
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Point & Shoot']"));
		act.moveToElement(ele2).click().build().perform();
		
	}

}
