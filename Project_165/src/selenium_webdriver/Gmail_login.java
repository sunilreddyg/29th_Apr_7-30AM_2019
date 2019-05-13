package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Identify editbox and type characters
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com"+Keys.ENTER);

		Thread.sleep(5000);
		
		//Identify password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello123456"+Keys.ENTER);
		
		
	
	}

}
