package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele=driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		act.click(ele1).perform();
		

	}

}
