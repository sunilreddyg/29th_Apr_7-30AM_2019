package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver_syntax 
{

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j")).sendKeys("akshay");
		
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("mugli");
		
		driver.findElement(By.id("u_0_o")).clear();
		driver.findElement(By.id("u_0_o")).sendKeys("944456454");
		
		
	}

}
