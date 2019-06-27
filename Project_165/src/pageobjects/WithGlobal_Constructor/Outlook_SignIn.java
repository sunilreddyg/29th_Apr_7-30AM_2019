package pageobjects.WithGlobal_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Outlook_SignIn 
{

	public Outlook_SignIn(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@class='linkButtonSigninHeader'][contains(.,'Sign in')]")
	public WebElement Signin_nav_btn;
	
	@FindBy(xpath = "//input[@name='loginfmt']")
	public WebElement Email_EB;
	
	@FindBy(xpath = "//div[@role='heading']")
	public WebElement Signin_page_Header;
	
	@FindBy(xpath = "//input[@value='Next']")
	public WebElement Email_Val_Next_BTN;
	
	@FindBy(xpath = "//input[@name='passwd']")
	public WebElement Password_EB;
	
	@FindBy(xpath = "//input[@name='KMSI']")
	public WebElement KeepMe_Signin_checkbox;
	
	
	
	
	
	
	
	
	
	
	
	

}
