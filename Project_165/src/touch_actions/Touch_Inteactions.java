package touch_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Touch_Inteactions {

	public static void main(String[] args) throws Exception
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Enable touch actions on automation browser
		TouchActions touch=new TouchActions(driver);
		
		//Identify Location
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		touch.singleTap(Category).build().perform();
		Thread.sleep(5000);
		
		
		touch.scroll(0, 500).build().perform();
		
		
		
	}

}
