package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_location 
{

	public static void main(String[] args) 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));

		
		Point Obj_point=Sensex_tab.getLocation();
		//Get X and Y coordinates
		int Obj_x=Obj_point.getX();
		int Obj_y=Obj_point.getY();
		
		System.out.println("Objected x coordinates are => "+Obj_x);
		System.out.println("Objected y coordinates are => "+Obj_y);
		
		
		//Verify Element visible using x and y coordinates..
		if(Obj_x > 0)
			System.out.println("Element visible at webpage");
		else
			System.out.println("Element not visible at webapge");
		
		
		/*
		 * Note:--> Get location method return zero coordinates for
		 * 			hidden elements.
		 */
		
	}

}
