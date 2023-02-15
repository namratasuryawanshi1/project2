package popupdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserwindow2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
		Thread.sleep(2000);
		String pid=driver.getWindowHandle();
		Set<String> cid=driver.getWindowHandles();
		for(String s:cid)
		{
			if(!s.equals(pid))
			{
				
				 String actual=driver.switchTo().window(s).getTitle();
				 if(actual.contains("linkedin"))
				 {
					 driver.findElements(By.xpath("(//button[@aria-label=\"Dismiss\"])[12]"));
					 Thread.sleep(5000);
					 driver.close();
				 }
				// driver.close();
				 
			}
		}
	}
	

}
