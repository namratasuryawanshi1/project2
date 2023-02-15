package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example5 {

	public static void main(String[] args) throws Exception {

		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet s=book.getSheet("Sheet1");
CellType type=s.getRow(4).getCell(2).getCellType();
		
		if(type==CellType.STRING)
		{
			System.out.println(s.getRow(3).getCell(2).getStringCellValue());
		}
		else if(type==CellType.NUMERIC)
		{
			System.out.println(s.getRow(3).getCell(2).getNumericCellValue());
		}
		else
		{
			System.out.println(s.getRow(3).getCell(2).getBooleanCellValue());
		}
	}


	}


