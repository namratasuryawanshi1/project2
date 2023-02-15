package popupdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultipleWndows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]")).click();
		String parentid=driver.getWindowHandle();
		Set<String> childids=driver.getWindowHandles();
		for(String s:childids)
		{
			if((s.equals(parentid)))
			{
				driver.switchTo().window(s);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentid);
		

	}

}
