package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("mobile");
		Thread.sleep(1000);
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]"));
		Thread.sleep(2000);
		String actual="mobile watch";
		for(WebElement a:ele)
		{
			String result=a.getText();
			System.out.println(result);
			if(result.equalsIgnoreCase(actual))
			{
				a.click();
				break;
			}
		}
		

	}

}
