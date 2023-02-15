package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screen1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		//step 1:
		TakesScreenshot s=(TakesScreenshot)driver;
		//step 2 and 3:
		File src=s.getScreenshotAs(OutputType.FILE);
		//step 4:
		File dest= new File("C:\\Users\\nmadh\\OneDrive\\Desktop\\software testing notes\\screenshot\\image1.png");
		
		FileHandler.copy(src, dest);

		
		
		


	}

}
