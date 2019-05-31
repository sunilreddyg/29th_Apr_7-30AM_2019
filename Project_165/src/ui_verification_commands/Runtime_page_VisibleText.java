package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_page_VisibleText 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify flight search without enter proper details.
		 * 
		 * 			Given url is  http://gmail.com
		 * 			when user enter valid email
		 * 			And click next button
		 * 			Then accept valid email and display password entry page..
		 */
		
		

		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://gmail.com");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@gmail.com");  //Valid email address
		
		//IDenticy Next button
		WebElement Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		Next_btn.click();
		Thread.sleep(5000);
		
		
		//IDentify Webpage
		WebElement Webpage=driver.findElement(By.tagName("body"));
		//capture visible text at webpage
		String page_VisibleText=Webpage.getText();
		System.out.println(page_VisibleText);
		
		
		//Verify expected text visible at webpage
		if(page_VisibleText.contains("qadarshan@gmail.com"))
		{
			System.out.println("Expected Text visible and password page displayed");
		}
		else
		{
			System.out.println("Expected text not visible and password page not displayed");
		}
		
		

	}

}
