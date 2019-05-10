package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args) 
	{
	    //Set runtime property before launch browser
		//System.setProperty("webdriver.gecko.driver", "D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();   //launch browser
		firefox.get("http://google.com");            //load url to browser window
		
		
		
	}

}
