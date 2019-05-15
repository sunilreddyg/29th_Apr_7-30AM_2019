package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Maximum_Selection {

	public static void main(String[] args) throws InterruptedException
	{
		
		/*
		 * Verify dropdown allow maximum selection maximum 3
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
	
		/*
		 * Using javascript executor change single option selection dropdown
		 * 	to multiple option selection dropdown.
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		
		//Decision statement to accept condition on multiple selection.
		if(flag==true)
		{
			System.out.println("Dropdown is multiple option selection type");
			
			//Select multiple option
			Select StateDropdown=new Select(driver.findElement(By.id("customState")));
			StateDropdown.deselectAll();  //Deselection command only accept on multiple selection type
			StateDropdown.selectByIndex(3);
			StateDropdown.selectByIndex(6);
			StateDropdown.selectByIndex(9);
			
			
				//Get All select option count
				int SelectionCount=StateDropdown.getAllSelectedOptions().size();
				//Write decision to verify maximum selection
				if(SelectionCount==3)
				{
					System.out.println("Accepted maximum selection");
				}
				else
				{
					System.out.println("mismatch in maximum selection");
				}
				
		}
		else
		{
			System.out.println("Dropdown is single option selection type");
		}
		
		
		
		
	}

}
