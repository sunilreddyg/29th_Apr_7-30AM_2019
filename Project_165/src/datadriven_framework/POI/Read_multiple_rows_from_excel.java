package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_multiple_rows_from_excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		String file_path="TestData\\";
		//Target file location
		FileInputStream fi=new FileInputStream(file_path+"InputData.xlsx");
		System.out.println("file located");
		
		//Get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//using book identify sheet
		XSSFSheet sht=book.getSheetAt(2);
		
		//Get First and last row number..
		int Fr_num=sht.getFirstRowNum();
		int Lr_num=sht.getLastRowNum();
		
		//Iterate for number of rows data available at sheet..
		for (int i = 5; i <= Lr_num; i++) 
		{
			
			//Target Each dynamic row
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"   "+PWD);
			
			
			//Write cell data in a existing and new cell
			sht.getRow(i).createCell(2).setCellValue("Testpass");
		}
		
		FileOutputStream fo=new FileOutputStream(file_path+"Output.xlsx");
		book.write(fo);
		book.close();
		
		
	}

}
