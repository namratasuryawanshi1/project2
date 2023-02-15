package practiceproject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		//List<WebElement> ele=driver.findElements(By.xpath(("//ul[@class=\"erkvQe\"]//ul/li"));
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class=\"erkvQe\"]/div/ul/li"));
		Thread.sleep(2000);
		 String expectedString="selenium interview question";
		 for(WebElement s:ele)
		 {
			 String actual=s.getText();
			 System.out.println(actual);
			 if(actual.equalsIgnoreCase(expectedString))
			 {
				 s.click();
				 break;
			 }
		 }
		
		

}
}
