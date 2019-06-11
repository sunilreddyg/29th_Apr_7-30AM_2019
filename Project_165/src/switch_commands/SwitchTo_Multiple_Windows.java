package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Multiple_Windows
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		

		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		//Iterate for number of windows
		for (String EachwindowID : AllwindowIDs) 
		{
			driver.switchTo().window(EachwindowID);
			//Get runtime page title
			String Runtime_title=driver.getTitle();

			//Decision to accept on expected title matching
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break; //Break iteration and keep control where title match.
			}
		}
		
		
		System.out.println("Focused window title is => "+driver.getTitle());
		


	}

}
