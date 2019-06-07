package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args) 
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Switch to Frame using FrameID/Name property
		driver.switchTo().frame("menuFrame");
		
		//Frame Under Element
		WebElement Fee_structure=driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]"));
		Fee_structure.click();
		
		//Get Controls from Menuframe to mainpage
		driver.switchTo().defaultContent();
		
		//Switch to Body Frame Using WebElement Referral
		WebElement BodyFrame=driver.findElement(By.xpath("//frame[@id='bodyFrame']"));
		driver.switchTo().frame(BodyFrame);
		
		
		//select Dropdown under body frame
		new Select(driver.findElement(By.id("univ")))
		.selectByIndex(4);
		
		
		//Get Controls from Menuframe to mainpage
		driver.switchTo().defaultContent();
		
		
		

	}

}
