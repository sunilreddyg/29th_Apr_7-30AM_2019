package datadriven_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Excel_Data_Run_WebDriver_Testcase {

	public static void main(String[] args) throws IOException 
	{
		
		String file_path="TestData\\InputData.xlsx";
		//Using FileInputStream target file location
		FileInputStream fi=new FileInputStream(file_path);
		System.out.println("file located");
		
		//Create object for Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet2");

		//target row using  sheet referral
		XSSFRow row=sht.getRow(1);
				
		String url=row.getCell(1).getStringCellValue();
		String Signin_nav_button=row.getCell(2).getStringCellValue();
		String locator_email=row.getCell(3).getStringCellValue();
		String Input_email=row.getCell(4).getStringCellValue();
		String Locator_Email_next_btn=row.getCell(5).getStringCellValue();
		
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);				
		//Browser initiation	
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//Click Signin navigation button to get login page
		driver.findElement(By.xpath(Signin_nav_button)).click();
		
		//Enter valid Email
		driver.findElement(By.xpath(locator_email)).clear();
		driver.findElement(By.xpath(locator_email)).sendKeys(Input_email);
		
		//CLick Next button
		driver.findElement(By.xpath(Locator_Email_next_btn)).click();
		
		
		
		
	}

}
