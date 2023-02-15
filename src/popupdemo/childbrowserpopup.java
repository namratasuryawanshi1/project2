package popupdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		Thread.sleep(2000);
		//step1:
		String parentid=driver.getWindowHandle();
		//step 2:
		Set<String> childids=driver.getWindowHandles();
		System.out.println(childids.size());
	//step 3:
		for(String s:childids)
		{
			if(!s.equals(parentid))
			{
				driver.switchTo().window(s);
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentid);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
