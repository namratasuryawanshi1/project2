package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).contextClick().build().perform();
		Thread.sleep(2000);
		
		for(int i=0;i<=3;i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
			
			//action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
