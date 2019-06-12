package screen_capture;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screen_of_Alert {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);  //Observation time..
		
		
		
		//Create object for Robot class..
		Robot robot=new Robot();
		
		//Get Default Window Dimension.
		Dimension ImageSize=Toolkit.getDefaultToolkit().getScreenSize();			
		BufferedImage image=robot.createScreenCapture(new Rectangle(ImageSize));
	    
		//Create file locaton..
		String imagepath="C:\\Users\\Administrator\\git\\29th_Apr_7-30AM_2019\\Project_165\\screens\\Image3.jpg";
		File path=new File(imagepath);  //Java.IO

		//Write image into local utilities..
		ImageIO.write(image, "jpg", path);
	
		

	}

}
