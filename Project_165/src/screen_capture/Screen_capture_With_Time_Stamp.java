package screen_capture;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.cache.ForwardingLoadingCache.SimpleForwardingLoadingCache;

public class Screen_capture_With_Time_Stamp {

	public static void main(String[] args) 
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
		
		
		
		//Get Default system date
		Date d=new Date();
		//Simple Date Formatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert date using simpel date formatter
		String time=sdf.format(d);
		
		
		try {
			
			//captured screen and converted into file format
			File src_image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Copy file into local utilities..
			FileUtils.copyFile(src_image, new File("screens\\"+time+"image.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		

	}

}
