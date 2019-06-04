package ui_verification_commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeparuteDate_and_SystemDate
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Testcase:-->
		 * 		Verify deparute date match with system date.
		 * Expected:-->
		 * 		Everday departure match with system date.
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		

		//Identify departure date editbox
		WebElement Departure_Date_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture input value from editbox
		String Ddate=Departure_Date_Editbox.getAttribute("value");
		
		
		//Get Default System date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//using simple date formatter convert default date
		String Sdate=sdf.format(d);
		
		//Verify Departure date matches with system date
		if(Ddate.equals(Sdate))
			System.out.println("date match found");
		else
			System.out.println("date found mismatch");
		
		
		
	}

}
