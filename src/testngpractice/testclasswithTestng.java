package testngpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import amazon.homepage;
import amazon.loginpage;

public class testclasswithTestng {
	WebDriver driver;
	homepage ah;
	XSSFSheet sheet;
@BeforeTest
public void browserConfigure()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
	 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@BeforeClass
public void openapplication() throws InterruptedException
{
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
}
@BeforeMethod
public void login() throws Exception
{
	FileInputStream file=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\amazon.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet s=book.getSheet("Sheet1");
	
 ah=new homepage(driver);
	ah.clickonsignin();
	loginpage al=new loginpage(driver);
	al.entermobileno(s.getRow(0).getCell(0).getStringCellValue());
	al.Clickoncontinue();
	
	al.enterpass(s.getRow(0).getCell(1).getStringCellValue());
	al.clickonsignin();}
	@Test
	
		public void validation() 
		{
			Reporter.log("valid user",true);
		}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout done",true);
	}
	@AfterClass
	public void closingapplication()
	{
		driver.close();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closing browser",true);
	}


	

}
