package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_Enable_OR_disableState 
{

	public static void main(String[] args) throws Exception 
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		//browser initiation.
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		
		
		/*
		 * Testcase:-->Verify locality editbox without city selection
		 * expected:--> Editbox should disable and display 
		 * 		text Please enter after city selection
		 * 	
		 */
		
		WebElement Locality_Editbox=driver.findElement(By.id("customLocality"));
		if(!Locality_Editbox.isEnabled()) //!--Not
			System.out.println("Testpass-Editbox is disabled");
		else
			System.out.println("Testfail editbox is enabled");
		
		
		
		/*
		 * Testcase:-->Verify locality editbox After city selection
		 * expected:--> Editbox should enable and display
		 * 		text Please enter locality
		 */
		
		//Select State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//Timeout to load city options
		Thread.sleep(5000);
		
		//Select City Dropdown
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		//Timeout before validate
		Thread.sleep(5000);
		
		
		if(Locality_Editbox.isEnabled())
			System.out.println("Testpass editbox enabled after state selection");
		else
			System.out.println("Testfail editbox disabled ");
	}

}
