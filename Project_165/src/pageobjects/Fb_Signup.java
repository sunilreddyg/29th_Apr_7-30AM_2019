package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Fb_Signup 
{
	
	
	@FindBy(how=How.ID,using="u_0_l")
	public WebElement Firstname_EB;
	
	@FindBy(id="u_0_n")
	public WebElement Surname_EB;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement Email_OR_Mobile_EB;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement Retype_Email_OR_Mobile_EB;
	
	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement Password_EB;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	public WebElement Month_DD;
	
	@FindBys(@FindBy(xpath="//select[@aria-label='Day']/option"))
	public List<WebElement> Month_Options;
	
	
	

}
