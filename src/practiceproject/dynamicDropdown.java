package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"IXG\"]")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"AMD\"]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		}
		driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//div[text()=\"GBP\"]")).click();


		driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
	}

}