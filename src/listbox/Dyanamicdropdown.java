package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicdropdown {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.spicejet.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='BOM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='DEL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
	Thread.sleep(2000);
	
	WebElement adult= driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
	int i=1;
	while(i<8)
	{
		adult.click();
		i++;
	}
	Thread.sleep(1000);
	WebElement child= driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
	int a=0;
	while(a<3)
	{
		child.click();
		a++;
	}
	Thread.sleep(2000);
	
	WebElement infant= driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
	int k=0;
	while(k<3)
	{
		infant.click();
		k++;
	}
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[text()=\"USD\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
}

}
