package ui_verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_url {

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://seleniumhq.org");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();

		
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();

		//Store Expected url
		String exp_url="https://www.seleniumhq.org/";
		
		
		//Verify Runtime url contains expected url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("Expected url Presented");
		}
		else
		{
			System.err.println("Wrong url presented");
		}
		
	}

}
