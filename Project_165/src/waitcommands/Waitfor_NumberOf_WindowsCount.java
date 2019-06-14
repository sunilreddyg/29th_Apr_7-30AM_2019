package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_NumberOf_WindowsCount {

	public static void main(String[] args) {
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Perform action on external link [External link open in new window]
		driver.findElement(By.linkText("Instagram")).click();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("timeout released expected windows are opened");
		
		

	}

}
