package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_New_Window 
{

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Get Current focused window runtime ID.
		String Main_windowID=driver.getWindowHandle();
		System.out.println(Main_windowID);
		
		//identify link
		WebElement Instagram=driver.findElement(By.linkText("Instagram"));
		Instagram.click();
		Thread.sleep(5000); //Timeout for window to load
		
		
		//Get All Window Dynamic IDS
		Set<String> AllwindowsIDs=driver.getWindowHandles();
		//Iterate using Foreach loop
		for (String EachWindowID : AllwindowsIDs) 
		{
			//Apply switch to all windows
			driver.switchTo().window(EachWindowID);
			//Decision to break loop on mismatch of mainwindow
			if(!Main_windowID.equals(EachWindowID))
			{
				break;  //It break iteration fo foreach and keep controls on New window..
			}
			
		}
		
		

		//Identify Editbox under Instagram page
		WebElement Email_Or_Mobile=driver.findElement(By.xpath("//input[contains(@name,'emailOrPhone')]"));
		Email_Or_Mobile.clear();
		Email_Or_Mobile.sendKeys("9030248855");
		
		
		//Switch to Main window
		driver.switchTo().window(Main_windowID);
		
		
		System.out.println("Current focused window title is => "+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
	}

}
