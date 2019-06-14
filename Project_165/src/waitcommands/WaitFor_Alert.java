package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Alert {

	public static void main(String[] args)
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify Location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		
		
		//Wait for alert presented at browser window
		new WebDriverWait(driver,30).until
		(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert closed");
		
		
		//Close alert without apply switch command
		//ExpectedConditions.alertIsPresent().apply(driver).accept();

	}

}
