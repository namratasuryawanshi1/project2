package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[text()=\"Fashion\"]"));
	Actions act= new Actions(driver);
	act.moveToElement(ele).build().perform();
	//driver.navigate().back();
	WebElement ele1=driver.findElement(By.xpath("//a[text()=\"Women Ethnic\"]"));
	act.moveToElement(ele1).perform();
	Thread.sleep(2000);
	WebElement ele2=driver.findElement(By.xpath("//a[text()=\"Women Sarees\"]")); 

	act.moveToElement(ele2).click().build().perform();
	//driver.close();

	}

}
