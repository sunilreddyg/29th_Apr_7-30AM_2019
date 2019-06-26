package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_PageObjects_Using_PageFactoryClass {

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Using Factory class identify all Page elements 
		Fb_Signup signup=PageFactory.initElements(driver, Fb_Signup.class);
		
		signup.Firstname_EB.clear();
		signup.Firstname_EB.sendKeys("NEwuser");
		
		signup.Surname_EB.clear();
		signup.Surname_EB.sendKeys("Webdriver");
		
		
		
		

	}

}
