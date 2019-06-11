package switch_commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewWindow_Using_iterators 
{

	public static void main(String[] args) throws Exception 
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		//identify link
		WebElement Instagram=driver.findElement(By.linkText("Instagram"));
		Instagram.click();
		Thread.sleep(5000); //Timeout for window to load
		
		
		//Get All dynamic Window IDs
		Set<String> AllwindowsIDs=driver.getWindowHandles();
		//Convert all Set of strings into tokens.
		Iterator<String> itr=AllwindowsIDs.iterator();
		
		//Read next token using next keyword
		String W1=itr.next();
		driver.switchTo().window(W1);
		String W1_title=driver.getTitle();
		System.out.println(W1_title);
		
		//Read next token using next keyword
		String W2=itr.next();
		driver.switchTo().window(W2);
		String W2_title=driver.getTitle();
		System.out.println(W2_title);
		
		

	}

}
