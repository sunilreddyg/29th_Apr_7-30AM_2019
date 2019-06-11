package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Sendkeys {

	public static void main(String[] args) throws InterruptedException
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		WebElement Exp_salary_btn=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Exp_salary_btn.click();
		Thread.sleep(3000);
		
		//Enable keyboard controls at automation browser
		Actions action=new Actions(driver);
		
		//USe Keybord shortcut at automation page
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//USe Keybord shortcut at automation page
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
				
		//USe Keybord shortcut at automation page
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


	}

}
