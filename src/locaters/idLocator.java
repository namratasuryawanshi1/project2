package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("namrata.madhekar@facebook.com");
		//Thread.sleep(2000);
		
		WebElement ele1= driver.findElement(By.id("pass"));
		ele1.sendKeys("gauri@27");
	//	Thread.sleep(2000);
		
		
		WebElement ele2= driver.findElement(By.name("login"));
		ele2.click();
		//Thread.sleep(2000);
		
		
		WebElement ele3= driver.findElement(By.tagName("input"));
		ele.sendKeys("namrata");
		Thread.sleep(2000);
		
		WebElement ele4= driver.findElement(By.tagName("input"));
		ele4.sendKeys("gauri@27");
	    Thread.sleep(2000);
		
	    WebElement ele5= driver.findElement(By.linkText("Forgotten password?"));
	    ele5.click();
		
		

	}

}
