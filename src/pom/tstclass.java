package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tstclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		FileInputStream file=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\ddfframework.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet s=book.getSheet("Sheet1");
		
		flipkarthome flh=new flipkarthome(driver);
		
		flipkartlogin fl=new flipkartlogin(driver);

	}

}
