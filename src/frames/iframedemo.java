package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframedemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
		//step1:
		driver.switchTo().frame("iframeResult");
		//step2:
		WebElement ele=driver.findElement(By.xpath("//input[@id='fname']"));
		ele.clear();
		ele.sendKeys("nama");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='lname']"));
		ele1.clear();
		ele1.sendKeys("madhekar");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().defaultContent();
		
	

	}

}
