package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_and_verify_title 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		String Exp_title="Selenium - Web Browser Automation";
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs(Exp_title));
		System.out.println("Selenium HQ title verified");
	
		
		
		WebElement Download_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Download_tab.click();
		
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Downloads page title verified");
		
		
		
		/*
		 * Note:--> Explicitwait throws "Timeout exception" In case
		 * 			expected behaviour not found.
		 */
	}

}
