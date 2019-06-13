package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Expected_url {

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Click Download link
		WebElement Download_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Download_tab.click();
		
		//Expected url is 
		String Exp_url="https://www.seleniumhq.org/download/";
		
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.urlContains(Exp_url));
		System.out.println("Url verified expected page displayed");
		
		
		
		

	}

}
