package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Syntax 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Automated");

		System.out.println("timeout released");
		
		
		/*
		 * Note:-->
		 * 		Implicit wait avoid nosuchelement exception.
		 */
		
		
	}

}
