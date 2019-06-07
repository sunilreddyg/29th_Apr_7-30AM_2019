package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Commands {

	public static void main(String[] args) {
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Navigate to Frame Using frame URL
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		
		//Frame Under Element
		WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		
		//Frame Under Element
		WebElement TripID=driver.findElement(By.xpath("//input[@title='Trip ID']"));
		TripID.clear();
		TripID.sendKeys("qadarshan@gmail.com");
		
		//Navigate back to mainpage
		driver.navigate().back();
		
		//Click Flights link under PageSource
		WebElement Flights_link=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights_link.click();

	}

}
