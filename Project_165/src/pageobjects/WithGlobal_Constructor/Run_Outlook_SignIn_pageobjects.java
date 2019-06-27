package pageobjects.WithGlobal_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Outlook_SignIn_pageobjects 
{

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		Outlook_SignIn signin=new Outlook_SignIn(driver);
		signin.Signin_nav_btn.click();
		
		signin.Email_EB.clear();
		signin.Email_EB.sendKeys("sunilreddy.gajjala@outlook.com");
		
		signin.Email_Val_Next_BTN.click();
		Thread.sleep(5000);
		
		if(signin.Password_EB.isDisplayed())
		{
			signin.Password_EB.clear();
			signin.Password_EB.sendKeys("hello123456");
			
		}
		else
		{
			 System.out.println("password editbox not visible at webpage");
		}
		
	}

}
