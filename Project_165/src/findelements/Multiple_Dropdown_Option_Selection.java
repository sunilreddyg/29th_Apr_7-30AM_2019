package findelements;

import java.time.MonthDay;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Write a program to select all dropdown options
		 *	using findelements option.
		 */
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
				
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify dropdown
		WebElement Month_dropdown=driver.findElement(By.id("month"));
		
		//Using month dropdown location identify list of opion tag element.
		List<WebElement> All_options=Month_dropdown.findElements(By.tagName("option"));
		
		for (int i = 0; i < All_options.size(); i++) 
		{
			
			 //target each option
			WebElement EachOption=All_options.get(i);
			String optioname=EachOption.getText();
			System.out.println("=> "+optioname);
			
			EachOption.click();
			Thread.sleep(1000);
		}
		
		
	}

}
