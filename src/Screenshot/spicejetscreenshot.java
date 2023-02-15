package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class spicejetscreenshot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(1000);
		screenshot("Application opened");
		
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='DEL']")).click();
		
		Thread.sleep(2000);
		screenshot("origin destination selected");
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		Thread.sleep(2000);
	
		WebElement adult= driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		int i=1;
		while(i<2)
		{
			adult.click();
			i++;
		}
		Thread.sleep(1000);
		WebElement child= driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
		int a=0;
		while(a<2)
		{
			child.click();
			a++;
		}
		Thread.sleep(2000);
		
		WebElement infant= driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
		int k=0;
		while(k<2)
		{
			infant.click();
			k++;
		}
		Thread.sleep(2000);
		screenshot("passengerselected");

		
		driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[text()=\"USD\"]")).click();
		Thread.sleep(2000);
		screenshot("currencyselected");
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
	
	


	}
	public static void screenshot(String filename) throws IOException
	{
		TakesScreenshot screen =(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\nmadh\\OneDrive\\Desktop\\software testing notes\\screenshot\\"+filename+".jpg");
		
		FileHandler.copy(src,dest);
	}

}
