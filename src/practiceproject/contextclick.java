package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
		for(int i=0;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			//act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

	}

}
