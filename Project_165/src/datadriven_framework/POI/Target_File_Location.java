package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_File_Location {

	public static void main(String[] args) throws IOException 
	{
		
		String file_path="TestData\\InputData.xlsx";
		//Using FileInputStream target file location
		FileInputStream fi=new FileInputStream(file_path);
		System.out.println("file located");
		
		//Create object for Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//target row using  sheet referral
		XSSFRow row=sht.getRow(1);
		
		//target cell using row referral
		XSSFCell cell=row.getCell(0);
		
		//Get String value from Cell
		String url=cell.getStringCellValue();
		System.out.println(url);
		
		//Using referral read first cell dta
		String CID=row.getCell(1).getStringCellValue();
		System.out.println("Customer ID is => "+CID);
		
		//Mobile Number Read from textcell.
		String Mobile_num=row.getCell(3).getStringCellValue();
		System.out.println(Mobile_num);
		
		
		
		
		
	}

}
