package pOM_DDF_TestNG_Baseclass_utilityclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;


public class Testclasswith_testng {
WebDriver driver;
Flipkart_home_page fhp;
XSSFSheet sheet;
	@BeforeTest
	public void browserconfiure()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeClass
	public void openapplication()
	{
	driver.get("https://www.Flipkart.com");
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException 
	{
	FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\ddfframework.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file1);
	sheet=book.getSheet("Sheet1");
	fhp=new Flipkart_home_page(driver);
	fhp.Clickonclose();
	
	Thread.sleep(1000);
	fhp.ClickOnLogin();
	Thread.sleep(1000);
	Flipkart_login_page flp=new Flipkart_login_page(driver);
	flp.entermobile(sheet.getRow(0).getCell(0).getStringCellValue());
	flp.enterPassword(sheet.getRow(0).getCell(1).getStringCellValue());

	Thread.sleep(1000);
	flp.clickOnLogin();
}
@Test
public void userValidation() throws InterruptedException
{
	Thread.sleep(1000);
	fhp.ValidateUser(sheet.getRow(0).getCell(2).getStringCellValue());
}
@AfterMethod
public void logout() throws InterruptedException
{
	Thread.sleep(1000);
	fhp.Clickonlogout(driver);
	Thread.sleep(2000);
}
@AfterClass

public void closingapplication()
{
	driver.close();
}
@AfterTest
public void closebrowser()
{
	Reporter.log("closing browser",true);
	

	}

}
