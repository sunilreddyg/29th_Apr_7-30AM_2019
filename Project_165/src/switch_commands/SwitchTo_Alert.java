package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword enter
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select courst and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);  //Observation time..
		
		
		Alert alert=driver.switchTo().alert();
		
		//Capture alert text
		String alert_text=alert.getText();
		System.out.println(alert_text);
		
		//close alert by Accepting it
		alert.accept();

		
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */

		

	}

}
