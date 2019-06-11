package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_Location 
{

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Enable Mouse and Keyboard interactions at automation  browser.
		Actions action=new Actions(driver);
		
		//Identify Location
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		//Perform mouse hove action on element
		action.moveToElement(Category).perform();
		Thread.sleep(5000);  //Time to load Sub Categories
		
		
		//Identify Location
		WebElement Mobiles_And_Computers=driver.findElement(By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]"));
		//Perform Hover action on element
		action.moveToElement(Mobiles_And_Computers).perform();
		Thread.sleep(5000);  //Time to load Sub Categories
		
		
		//Identify Locaiton
		WebElement Laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		//Perform click action using Mouse Interactions
		action.click(Laptops).perform();
		
		
		
		
		
		
		

	}

}
