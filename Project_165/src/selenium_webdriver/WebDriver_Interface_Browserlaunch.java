package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface_Browserlaunch 
{

	public static void main(String[] args) {
		
		//Set runtime property before launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch chrome browser
		driver.get("http://facebook.com");    //load webpage to browser window
		driver.manage().window().maximize();  //window maximize [Optional]
		
		//Identify email editbox and type characters init
		driver.findElement(By.id("email")).clear();      
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//identify password editbox and type characters init
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("hello123456");
		
		//identify signin button and perform click
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
