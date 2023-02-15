package practiceproject;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class parameterisation {

	public static void main(String[] args)  throws Exception{
		
	FileInputStream file=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sheet=book.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(2);
	XSSFCell col=row.getCell(2);
	boolean b=col.getBooleanCellValue();
	
	System.out.println(b);
	
	}

}
