package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_text 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> Verify flight search without enter proper details.
		 * 
		 * 			Given url is  http://cleartrip.com
		 * 			when user click search flights button
		 * 			Then system response with appropriate error message.
		 */
		
		
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://cleartrip.com");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Identify Search flights button
		WebElement Search_flights=driver.findElement(By.xpath("//input[@value='Search flights']"));
		Search_flights.click();  //Click button witout enter any proper details
		
		
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.id("homeErrorMessage"));
		//Capture element outter text at error location
		String Runtime_text=Error_location.getText();

		//Expected text in referal
		String Exp_Text="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		
		//Writing decision statement
		if(Runtime_text.equals(Exp_Text))
		{
			System.out.println("Testpass: Expected Error msg displayed on invalid flight search");
		}
		else
		{
			System.out.println("Testfail:--> Expected error msg was not displayed on invalid flight search");
		}

	}

}
