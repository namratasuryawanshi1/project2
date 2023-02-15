package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example4 {

	public static void main(String[] args) throws Exception {

		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		System.out.println(book.getSheet("Sheet1").getRow(0).getCell(1).getCellType());
		CellType type=book.getSheet("Sheet1").getRow(2).getCell(2).getCellType();
		System.out.println(type);
		
		

		


	}

}
