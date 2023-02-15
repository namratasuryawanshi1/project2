package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example6 {

	public static void main(String[] args) throws Exception {
		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet s=book.getSheet("Sheet1");
		int rowsize=s.getLastRowNum()+1;
		int cellsize=s.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowsize;i++)//i=0
		{
			for(int j=0;j<cellsize;j++)//j=0 1
			{					//getRow(0).getCell(1)
				CellType type=s.getRow(i).getCell(j).getCellType();
				if(type==CellType.STRING)
				{
					System.out.print(s.getRow(i).getCell(j).getStringCellValue()+"  ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(s.getRow(i).getCell(j).getNumericCellValue()+"  ");
				}
				else
				{
					System.out.print(s.getRow(i).getCell(j).getBooleanCellValue()+"  ");
				}
			}
			System.out.println();
		}

	}



	}


