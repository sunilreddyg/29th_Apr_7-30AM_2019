package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Verify_AlertPresented {

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
		
		
		//Write Condition to accept on alert presented
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//switch to alert 
			Alert alert=driver.switchTo().alert();
			
			//Capture alert text
			String alert_text=alert.getText();
			System.out.println(alert_text);
			
			//close alert by Accepting it
			alert.accept();
		}
		else
		{
			System.out.println("Alert not presented");
		}
		
		
		

	}

}
