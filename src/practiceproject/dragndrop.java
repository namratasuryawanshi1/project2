package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag=driver.findElement(By.xpath("//li[@id=\"credit2\"]"));
		WebElement drop=driver.findElement(By.xpath("//ol[@id=\"bank\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();
	}

}
