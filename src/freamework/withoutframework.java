package freamework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutframework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://www.flipkart.com");
		   
		   driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		   
		   driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		   
		   driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8482809373");
		   
		   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Hello@1234");
		   
		   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		   
		   Thread.sleep(1000);
		   
		   String actualid=driver.findElement(By.xpath("(//div[@class=\"exehdJ\"])[1]")).getText();
		   
		   String expectedID="Pooja";
		   
		   if(actualid.equalsIgnoreCase(expectedID))
		   {
			   System.out.println("Test case passed");
		   }
		   else
		   {
			   System.out.println("Test case failed");
		   }
		   

	}
}



