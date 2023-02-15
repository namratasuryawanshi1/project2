package POM_PageFactory_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.Flipkart.com");
	
	FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\ddfframework.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file1);
	XSSFSheet sheet=book.getSheet("Sheet1");
	Flipkart_home_page fhp=new Flipkart_home_page(driver);
	fhp.Clickonclose();
	
	Thread.sleep(1000);
	fhp.ClickOnLogin();
	Thread.sleep(1000);
	Flipkart_login_page flp=new Flipkart_login_page(driver);
	flp.entermobile(sheet.getRow(0).getCell(0).getStringCellValue());
	flp.enterPassword(sheet.getRow(0).getCell(1).getStringCellValue());

	Thread.sleep(1000);
	flp.clickOnLogin();

	Thread.sleep(1000);
	fhp.ValidateUser(sheet.getRow(0).getCell(2).getStringCellValue());
	

	}

}
