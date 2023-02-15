package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		//WebElement month=driver.findElement(By.xpath("//select[@id=\"month\" ]"));
		//WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		driver.findElement(By.xpath("//input[@id=\"u_2_4_Lz\"]")).click();
		Thread.sleep(2000);
	
		//Select s=new Select(day);
		//s.selectByIndex(4);
		
		
		

	}

}
