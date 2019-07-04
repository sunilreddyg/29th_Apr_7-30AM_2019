package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DataDrivern_Using_Conditions 
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
		XSSFSheet sht=book.getSheetAt(3);
		
		//Get First and last row number..
		int Fr_num=sht.getFirstRowNum();
		int Lr_num=sht.getLastRowNum();
		
		//Iterate for number of rows data available at sheet..
		for (int i = 5; i <= Lr_num; i++) 
		{
			String Exe_Status=sht.getRow(i).getCell(2).getStringCellValue();
			if(Exe_Status.equalsIgnoreCase("y"))
			{
				

				//Target Each dynamic row
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(UID+"   "+PWD);
				
				
				//Get Scenario Type
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				switch (Stype) {
				case "p":
					sht.getRow(i).createCell(4).setCellValue("Positive data captured");
					break;
				
				case "n":
					sht.getRow(i).createCell(4).setCellValue("negative data captured");
					break;
					
				case "alert":
					sht.getRow(i).createCell(4).setCellValue("Alert handled");
					break;
					
				default: System.out.println("Scenario mismatch in excel");
					break;
				}
				
			}
			
			
		}
		
		//Creating output file
		FileOutputStream fo=new FileOutputStream(file_path+"Output.xlsx");
		book.write(fo);
		book.close();
	}

}
