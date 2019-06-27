package method_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Fb_Signup;

public class Run_Repository_Keywords {

	public static void main(String[] args) 
	{
	
		
		//Create object for Repsoitory
		Repository obj=new Repository();
		obj.LaunchBrowser("firefox");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//Using String parameter [Only for expath]
		obj.Enter_text("//input[@name='firstname']", "Newuser");
		obj.Enter_text("//input[@name='lastname']", "webdriver");
		
		//Using By Class parameter
		obj.Enter_text(By.name("reg_email__"), "newuserwebdriver@gmail.com");

		
		//USing WebElement Parameter
		Fb_Signup signup=PageFactory.initElements(obj.driver, Fb_Signup.class);
		obj.Enter_text(signup.Retype_Email_OR_Mobile_EB, "newuserwebdriver@gmail.com");
		obj.Enter_text(signup.Password_EB, "Hello123456");
		
		obj.Select_dropdown(signup.Day_DD, "12");
		
	}

}
