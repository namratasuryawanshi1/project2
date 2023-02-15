package pOM_DDF_TestNG_Baseclass_utilityclass;


	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class Utilityclass 
	{
		//Utility class has different methods like fetching data from excel, screenshot

		public static String fetchdata(int rowindex,int colindex) throws IOException
		{
			FileInputStream file1= new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\dddframework.xlsx");
			
			XSSFWorkbook book= new XSSFWorkbook(file1);
			
			XSSFSheet sheet=book.getSheet("Sheet1");
			
			String data=sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
			
			return data;
		}
		
		public static void screenShot(WebDriver driver,String filename) throws IOException
		{
			TakesScreenshot sc=(TakesScreenshot)driver;
			File src=sc.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\Namrata\\Desktop\\software testing notes\\screenshot"+filename+".jpg");
			FileHandler.copy(src, des);
		}

	


}


