package corejava.Variables.Global;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Helper 
{
	public WebDriver driver=null;
	public String browser_driver_path=null;
	public String page_url=null;
	public String username=null;
	public String password=null;
	public String browsername=null;


	public void Lanch_chrome_Browser()
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver",browser_driver_path);
		//Launch browser instance
		driver= new ChromeDriver();
		//load webpage to browser window
		driver.get(page_url);
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
	}
	
	
	public void User_login_Invalid_password()
	{
		
		WebElement UID_Element=driver.findElement(FB_Locators.Signin_Email_EB);
		UID_Element.clear();
		UID_Element.sendKeys(username);
		
		WebElement PWD_Element=driver.findElement(FB_Locators.Signin_pwd_EB);
		PWD_Element.clear();
		PWD_Element.sendKeys(password);
		
		WebElement Signin_btn=driver.findElement(FB_Locators.Signin_Login_BTN);
		Signin_btn.click();
	}
	
	
	
	

}
