package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		//Select dropdown option using Option visible name..
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		Thread.sleep(5000);
		
		//Select dropdown option using Option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		
		
		//Type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		
		//Select dropdown using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		
		
		/*
		 * Diff between "select class" methods and "Sendkeys" method
		 * 
		 * 	Note:--> Because sendkeys command accept keyboar shortcuts
		 * 			it doesn't throw exception when required option not
		 * 			exsit at dropdown..
		 * 
		 * Note:-->
		 * 			Select Class Dropdown options [Selectbyvisibltext] throw exception in
		 * 			case option not exist at dropdown..
		 * 
		 */
		
		
		
		
		//Select branch checkbox   [Checkbox selection]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		
		
		
		
		
		
		
		



	}

}
