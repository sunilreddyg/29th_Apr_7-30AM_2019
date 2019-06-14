package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Element_Selection 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Element
		By Roundtrip_locator=By.xpath("//input[@value='RoundTrip']");
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementSelectionStateToBe
				(Roundtrip_locator, true));
		System.out.println("Selection state is true");
	}

}
