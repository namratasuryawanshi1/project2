package practiceproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parametarisation2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet sheet=book.getSheet("Sheet1");

		int rowsize=sheet.getLastRowNum()+1;
		int colsize=sheet.getRow(0).getLastCellNum();
		System.out.println(rowsize);
		System.out.println(colsize);
		System.out.println();
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				CellType type=sheet.getRow(i).getCell(j).getCellType();
				if(type==CellType.STRING)
				{
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+" ");
				}
				else
				{
					
					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue()+" ");
				}
			}System.out.println();
		}
		
		
	}

	
}

