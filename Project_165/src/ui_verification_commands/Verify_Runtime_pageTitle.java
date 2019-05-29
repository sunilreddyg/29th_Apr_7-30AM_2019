package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_pageTitle 
{

	public static void main(String[] args) 
	{
		/*
		 * Testcase:--> Verify homepage displayed for SeleniumHQ website
		 * Steps   :--> launch and load webpage
		 * EXpected:--> System should display page along with unique title
		 * 						"Selenium - Web Browser Automation"
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://seleniumhq.org");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		String Exp_title="Selenium - Web Browser Automation";
		//Captur runtime title
		String Runtime_title=driver.getTitle();
		
		
		//Verify Equal comparision between two strins
		boolean flag=Runtime_title.equals(Exp_title); 
		System.out.println("Comparision status is => "+flag);
		
		
		//Write decision statement to continue scription on correct title
		if(flag==true)
		{
			System.out.println("Title verified for seleniumhq homepage");
			
			//click Download link
			WebElement Download_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Download_tab.click();
			
			//Nested if condition
			if(driver.getTitle().equals("Downloads"))
				System.out.println("Download page title verified");
			else
				System.out.println("Download page title mismatch");
			
		}
		else
		{
			System.out.println("Title mismatch for seleniumhq homepage");
		}
		

	}

}
