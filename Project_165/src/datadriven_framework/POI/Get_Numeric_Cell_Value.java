package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Numeric_Cell_Value 
{

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
		
		//Get Numeric cell data
		Double price=row.getCell(4).getNumericCellValue();
		Double mobile=row.getCell(5).getNumericCellValue();
		
		System.out.println("Ammount in double format => "+price);
		System.out.println("Mobile number in doubel format => "+mobile);
		
		//Get Double format value into Long value 
		long mobile_int_format=mobile.longValue();
		System.out.println("mobile number in long format is => "+mobile_int_format);
		
		
		//Convert Mobile number from double format to String format..
		String mobile_String_format=NumberToTextConverter.toText(mobile);
		System.out.println("mobile number in String format is => "+mobile_String_format);

	}

}
