package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Cell_DataTo_Excel {

	public static void main(String[] args) throws IOException {
		
		String file_path="TestData\\InputData.xlsx";
		//Using FileInputStream target file location
		FileInputStream fi=new FileInputStream(file_path);
		System.out.println("file located");
		
		//Create object for Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Write cell data into existing row and existing cell
		sht.getRow(1).getCell(2).setCellValue("Newpwd123");
		
		//Write Cell data into Existing row and new cell
		sht.getRow(1).createCell(6).setCellValue("Newcell");
		
		//Write cell data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("NewRow_And_NewCell");
	
		//create file ouput stream.
		FileOutputStream fo=new FileOutputStream("TestData\\OP.xlsx");
		//Write Runtime data to Output file
		book.write(fo);
		
		//Write and save data
		book.close();
		
		
		
	}

}
