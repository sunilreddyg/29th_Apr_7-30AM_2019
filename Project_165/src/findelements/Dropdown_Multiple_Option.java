package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_Multiple_Option 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify respective cities displayed on correspondent State
		 * 			    selection
		 */
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
				
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
	
		String Cities[]={"Please select state first","South Andaman","Guntur","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Get List of option tags under select tag
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of states
		for (int i = 0; i < 6; i++)
		{
			//Get Each state using index number
			WebElement EachState=All_States.get(i);
			String StateName=EachState.getText();
			//Click Each State
			EachState.click();
			Thread.sleep(3000);
			
			//Identify Citydropdown and Capture city names 
			WebElement City_dropdown=driver.findElement(By.id("customCity"));
			String All_Cities=City_dropdown.getText();
			

			boolean flag=All_Cities.contains(Cities[i]);
			System.out.println(StateName+"   City ---"+Cities[i]+" ---Display status is => "+flag);
		
			
		}
		
		
		
	}

}
