package selenium_webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_Name_Class 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//By Using Name Locator for Textbox
		driver.findElement(By.name("origin")).clear();
		driver.findElement(By.name("origin")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");

		driver.findElement(By.name("destination")).clear();
		driver.findElement(By.name("destination")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
		
		driver.findElement(By.id("DepartDate")).click();
		
		//By using Class Name locator for Button
		driver.findElement(By.className("nextMonth")).click();
		
		//By Using linktext locator for links
		driver.findElement(By.linkText("16")).click();
		
		//By Using Name locator for DropDown/listbox
		new Select(driver.findElement(By.name("adults"))).selectByIndex(2);
		new  Select(driver.findElement(By.name("childs"))).selectByValue("3");
		new Select(driver.findElement(By.name("infants"))).selectByVisibleText("1");
	
		//By using Class name locator for search
		driver.findElement(By.className("booking")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
