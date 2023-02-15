package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		String actualRes=driver.getTitle();
		
		if(actualRes.equalsIgnoreCase("youtube"))
		{
			System.out.println("Youtube is open");
		}
		else
		{
			System.out.println("youtube is not open");
		}
		Thread.sleep(2000);
	    WebElement ele1= driver.findElement(By.name("search_query"));
		ele1.sendKeys("kesariya official");
		Thread.sleep(2000);
		
		WebElement ele2= driver.findElement(By.id("search-icon-legacy"));
		ele2.click();
		Thread.sleep(1000);
		
		WebElement ele3= driver.findElement(By.partialLinkText("Kesariya"));
		ele3.click();
		Thread.sleep(50000);
		
		
		}
	}
	
	





