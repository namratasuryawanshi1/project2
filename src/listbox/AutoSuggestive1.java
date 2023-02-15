package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//input[(@id=\"twotabsearchtextbox\")]"));
		ele.sendKeys("realme");
		Thread.sleep(2000);
		
		List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		Thread.sleep(2000);
		 String expectedString="realme 9";
		 for(WebElement s:ele1)
		 {
			 String actual=s.getText();
			 System.out.println(actual);
			 if(actual.equalsIgnoreCase(expectedString))
			 {
				 s.click();
				 break;
			 }
		 }
	
	
	}
	

}
