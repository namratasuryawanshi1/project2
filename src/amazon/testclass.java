package amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.flipkarthome;
import pom.flipkartlogin;

public class testclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		FileInputStream file=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\amazon.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet s=book.getSheet("Sheet1");
		
		homepage ah=new homepage(driver);
		ah.clickonsignin();
		loginpage al=new loginpage(driver);
		al.entermobileno(s.getRow(0).getCell(0).getStringCellValue());
		al.Clickoncontinue();
		
		al.enterpass(s.getRow(0).getCell(1).getStringCellValue());
		al.clickonsignin();
		
		

	}

}
