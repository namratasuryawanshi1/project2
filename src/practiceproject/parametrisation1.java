package practiceproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parametrisation1 {

	public static void main(String[] args) throws IOException {

		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		System.out.println(book.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue());
	}

}
