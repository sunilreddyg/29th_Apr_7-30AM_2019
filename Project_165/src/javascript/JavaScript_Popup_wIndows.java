package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup_wIndows {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Create popup window
		 ((JavascriptExecutor)driver).executeScript("return alert('Tc001 Executed successfull')");
		 Thread.sleep(5000);
		 //Close alert window
		 driver.switchTo().alert().accept();
		 
		 
		
	}

}
