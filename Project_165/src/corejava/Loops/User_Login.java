package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of data.
		 */
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Runtime double dimensional array..
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
			};
		
		
		//Iterate for array length
		for (int i = 0; i < userdata.length; i++) 
		{
			
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys(userdata[i][0]);
			
			WebElement Password=driver.findElement(By.id("pass"));
			Password.clear();
			Password.sendKeys(userdata[i][1]);
			
			Thread.sleep(3000);
		
		}
		

	}

}
