package popupdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);
		alt.sendKeys("abc");
		Thread.sleep(2000);
		
		alt.accept();
	
		WebElement ele=driver.findElement(By.xpath("// div[@id='output']"));
		System.out.println(ele.getText());
	}
	}


