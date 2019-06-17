package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Return_Commands 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		 //Return page title
		 String page_title=((JavascriptExecutor)driver).executeScript("return document.title").toString();
		 System.out.println(page_title);
		 

	}

}
