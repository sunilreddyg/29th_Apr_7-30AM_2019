package screen_capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaputreScreen_At_location 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		//Move cursor point to spot location.
		WebElement Footer=driver.findElement(By.xpath("//a[@href='/about']"));
		new Actions(driver).moveToElement(Footer).perform();
		Thread.sleep(3000);
		
		
		
		try {
			
			//captured screen and converted into file format
			File src_image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Copy file into local utilities..
			FileUtils.copyFile(src_image, new File("screens\\image2.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}

}
