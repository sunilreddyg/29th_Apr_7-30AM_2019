package framework_junit;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit_WebDriver_Script 
{
	
	static WebDriver driver;
	static WebDriverWait wait;
	public @Rule TestName test=new TestName();  //Only available at junit latest version
	
	
	@Test
	public void Tc001_Verify_Signup_Link()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("title verified for signup link");
	}
	
	

	@Test
	public void Tc001_Verify_Messenger_Link()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("title verified for MessengerPage");
	}
	
	
	
	
	
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, 20);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		
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
			FileUtils.copyFile(src_image, new File("screens\\"+time+test.getMethodName()+".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}



}
