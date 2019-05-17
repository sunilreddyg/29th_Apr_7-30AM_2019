package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//browser initiation..
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);  //Timeout to load notification popup displayed
		
		
		
		//select roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		Thread.sleep(2000);
		
		//Identify from editbox and type referral keyword
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);  //Timeout to load suggestions
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify To editbox and type referral keyword
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("MEL");
		Thread.sleep(4000);  //Timeout to load suggestions
		driver.findElement(By.linkText("Melbourne, AU - Tullamarine (MEL)")).click();
		Thread.sleep(2000);
		
		//select Date at Deparet Data Calendar
		driver.findElement(By.linkText("19")).click();
		Thread.sleep(2000);
		
		//Type Data at return date editbox
		driver.findElement(By.id("ReturnDate")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 23 Aug, 2019");
		Thread.sleep(2000);
		
		//Click Search flghts button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		

	}

}
