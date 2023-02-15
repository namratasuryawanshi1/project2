package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example3 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("C:\\Users\\Namrata\\Desktop\\software testing notes\\excelsheets\\data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		int rowsize=book.getSheet("data").getLastRowNum()+1;
		System.out.println(rowsize);
		int cellsize=book.getSheet("data").getRow(0).getLastCellNum();
		System.out.println(cellsize);
		
		for(int i=0;i<rowsize;i++)//outer forloop for row i=0 1 2
		{
			for(int j=0;j<cellsize;j++)//inner forloop for column  j=0
			{
				String str=book.getSheet("data").getRow(i).getCell(j).getStringCellValue();
			
												//	getRow(2).getCell(0)
				System.out.print(str+"   ");
		}
			System.out.println();
		}



		

	}

}
