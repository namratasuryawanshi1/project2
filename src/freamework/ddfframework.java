package freamework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddfframework {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://www.flipkart.com");
		   driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		   
		   driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		   FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\ddfframework.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(file1);
			XSSFSheet s=book.getSheet("Sheet1");
			
			String user=s.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(user);
			  
			String password=s.getRow(0).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
			   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
			   
			   Thread.sleep(1000);
			   
			   String actualid=driver.findElement(By.xpath("(//div[@class=\"exehdJ\"])[1]")).getText();
			   
			   String expectedId=s.getRow(0).getCell(2).getStringCellValue();
			   
			   if(actualid.equalsIgnoreCase(expectedId))
			   {
				   System.out.println("Test case passed");
			   }
			   else
			   {
				   System.out.println("Test case failed");
			   }
	
	
		}
	}

			   

			



	


