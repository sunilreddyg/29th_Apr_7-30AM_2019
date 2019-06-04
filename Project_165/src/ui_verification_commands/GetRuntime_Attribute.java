package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Click Market links
		WebElement Markets_link=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets_link.click();
		
		//Identify Sensex tab
		WebElement Sensex_tab=driver.findElement(By.id("InvestRec"));
		//Click Sensex tab
		Sensex_tab.click();
		
		
		//Get Runtime class property of sensex tab
		String Runtime_Class=Sensex_tab.getAttribute("class");
		
		
		//Verify Sensex tab acive on Click operation.
		if(Runtime_Class.contains("tab-active"))
		{
			System.out.println("As expected Sensex tab selected");
		}
		else
		{
			System.out.println("Sensex tab not selected");
		}
		
		
		
		
		
		
		
		

	}

}
