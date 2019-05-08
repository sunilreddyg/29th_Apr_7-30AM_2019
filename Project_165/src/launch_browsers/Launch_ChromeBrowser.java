package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver:-->
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		   :--> click on google chromedriver link under third pary drivers.
		 *         :--> Select chromedriver version w.r.t chrome browser
		 *         :--> Choose Operating system and download zip format file
		 *         ;--> After download unzip file to backup drive.
		 *         
		 *         Note;-->
		 *         		Set Environment variable before launch browser..
		 *         		System.setProperty("Keyname","Location_of_.exe");
		 * 
		 */
		
		//Set runtime environment variable path before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");

	}

}
