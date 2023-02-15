package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
		WebElement drop=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		
	}

}
