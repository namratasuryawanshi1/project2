package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			WebElement ele=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
			Actions act=new Actions(driver);
			act.moveToElement(ele).contextClick().build().perform();
			WebElement ele1=driver.findElement(By.xpath("//span[text()=\"Paste\"]"));
			act.moveToElement(ele1).click().build().perform();
			
	}

}
