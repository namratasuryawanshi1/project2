package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet sheet=book.getSheet("Sheet2");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(1);
		System.out.println(cell.getNumericCellValue());


	}

}
