package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class While_loop {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * While:-->  Is a condition based loop it accept iteration when condition
		 * 			  return true and stop iteration when condition return false.
		 * 
		 */
		
		
		int i=0;
		while(i < 20)
		{
			System.out.println(i);
			i=i+1;
		}
		
		/*
		 * Example print numbers from 1 to 20
		 */
		
		
		

		//Example:--> Using while loop wait until element displayed at webpage
		 
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			

		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Retype email
		WebElement Retype_email=driver.findElement(By.xpath("//input[contains(@id,'u_0_t')]"));
		
		int j=0;
		while(!Retype_email.isDisplayed())
		{
		
			if(j==30)
			{
				throw new Exception("Timeout completed Return email is not displayed");
			}
			
			Thread.sleep(1000);
			j=j+1;
			
		}
		
		System.out.println("timeout released");
		
		
		
		
		
		
		
		
		
	}

}
