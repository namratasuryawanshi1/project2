package practiceproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class keyboardActions {
 static WebDriver driver;
	public static void screenshot(String s) throws IOException
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Namrata\\Desktop\\software testing notes\\screenshot\\"+s+".jpg");
		FileHandler.copy(src, dest);
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		screenshot("homepage");
		WebElement user=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Actions act=new Actions(driver);
		act.sendKeys(user, "good").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.click(pwd).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		screenshot("loginpage");
		
		
	}

}
