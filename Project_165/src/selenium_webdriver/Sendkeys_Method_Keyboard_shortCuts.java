package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sendkeys_Method_Keyboard_shortCuts 
{

	public static void main(String[] args) 
	{
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify Firstname editbox [Performing keyboard shoutcts at editbox]
		driver.findElement(By.id("u_0_j"))
		.sendKeys("Akshay"+Keys.TAB+"Kishan"+Keys.TAB+"Akshaykishan@gmail.com");
		
		
		//Identify Dropdown and perfrom keyboard shorctus..
		driver.findElement(By.id("day")).sendKeys("24");
		
		//Identify Dropdown and perfrom keyboard shorctus..
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 
		
		//Identify radio button.
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE);

		

	}

}
