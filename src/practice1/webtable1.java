package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		Thread.sleep(2000);
		List<WebElement> row=driver.findElements(By.xpath("//table//tr[3]")); 
		System.out.println(row.size());
		List<WebElement> col=driver.findElements(By.xpath("//table//tr[1]/th")); 
		System.out.println(col.size());
	}

}
