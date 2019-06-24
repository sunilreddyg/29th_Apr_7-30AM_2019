package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Picker_Active_Dates {

	public static void main(String[] args) throws InterruptedException 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
		//Browser initiation	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Identify calendar link
		WebElement Calendar_Link=driver.findElement(By.className("cal_openLink"));
		//Click Link Calendar to Visible at webapge
		Calendar_Link.click();
		
		
		
		
		//Iteration to click Next Month Button
		for (int i = 0; i < 6; i++) 
		{
			
			//Identify only Active month table
			WebElement Active_Month_Table;
			Active_Month_Table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			//Get Current Month active links
			List<WebElement> Active_month_dates;
			Active_month_dates=Active_Month_Table.findElements(By.tagName("a"));
			
			//iterate for Active links
			for (int j = 0; j < Active_month_dates.size(); j++)
			{
				
				//Target Each Acive date
				WebElement Acive_Date=Active_month_dates.get(j);
				Acive_Date.click();
				
				Thread.sleep(1000);
				Calendar_Link.click();
				
				
				//Restore all calendar identification to avoid stalelementreference exception.
				Active_Month_Table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_month_dates=Active_Month_Table.findElements(By.tagName("a"));
			}
			
		
			
			if(i==4)
			{
				//Identify Next month calendar
				WebElement Next_Month_Table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				List<WebElement> Next_month_Table_Active_links=Next_Month_Table.findElements(By.tagName("a"));
				Next_month_Table_Active_links.get(0).click();  
				
				//Open Calendar
				Calendar_Link.click();
			}
			
			WebElement Next_Month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_Month_btn.click();
			
		}
		
		
		
	}

}
