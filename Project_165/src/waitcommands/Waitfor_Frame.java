package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Frame 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
	
		//Wait for frame
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//click Signin button
		WebElement SignIn_btn=driver.findElement(By.xpath("//button[@class='login-btn'][contains(.,'Sign in')]"));
		SignIn_btn.click();
		
		//Identify frame locator
		By modalFrame=By.className("modalIframe");
		
	
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
				(modalFrame));
		System.out.println("Control available at modal frame");


		//Enter Mobile number
		WebElement mobileNum=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileNum.clear();
		mobileNum.sendKeys("9030248855");
		
		
	}

}
