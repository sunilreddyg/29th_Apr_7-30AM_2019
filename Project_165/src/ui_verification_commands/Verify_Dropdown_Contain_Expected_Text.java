package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Contain_Expected_Text {

	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * Testcase:-->
		 * 			Verify respective city option displayed on State selection.
		 */
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Select any state seletion
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);   //Timeout to load cities
		
		
		//IDentify City Dropdown
		WebElement City_Dropdown=driver.findElement(By.name("cityName"));
		String All_City_Options=City_Dropdown.getText(); //This method capture all cities under Dropdown..
		//System.out.println(All_City_Options);
		
		
		//Condition to accept on Expected City Displayed
		if(All_City_Options.contains("Anantapur"))
		{
			System.out.println("Expected city displayed on respective state selection");
		}
		else
		{
			System.out.println("Expected city not available at dropdown list");
		}


	}

}
