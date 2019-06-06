package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unexpected_AlertsTo_Handle 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=null;
		
		try {
			
			//set runtime environment variable
			String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driver_path);
			//Browser initiation
			driver=new ChromeDriver();
			if(driver!=null)
			{
				driver.get("https://www.firstnaukri.com/");
				driver.manage().window().maximize();
				
			}
			//Identify Search button
			WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
			Search_btn.click();
			Thread.sleep(5000);  //Observation time..
			
		} catch (UnhandledAlertException e) {
			e.printStackTrace();
			driver.switchTo().alert().accept();
		}
		
		
		

	}

}
