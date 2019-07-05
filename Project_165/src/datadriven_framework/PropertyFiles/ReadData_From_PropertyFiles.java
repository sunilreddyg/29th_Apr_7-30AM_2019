package datadriven_framework.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_From_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\29th_Apr_7-30AM_2019\\Project_165\\src\\datadriven_framework\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for Properties
		Properties repository=new Properties();
		//load input data to property files
		repository.load(fi);
		
		//Get Any object value using object keyname
		String Appurl=repository.getProperty("facebook.url");
		System.out.println(Appurl);
		
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Appurl);
		driver.manage().window().maximize();
		
	
		//Get Object from repository
		String Input_UID=repository.getProperty("username");
	    String Obj_UID_location=repository.getProperty("username_locator");
	    
	    driver.findElement(By.xpath(Obj_UID_location)).clear();
	    driver.findElement(By.xpath(Obj_UID_location)).sendKeys(Input_UID);
		
	   

	}

}
