package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{

		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript on automation browser..
		JavascriptExecutor js=((JavascriptExecutor)driver);
			
		//Type text into editbox..
		js.executeScript("document.getElementById('u_0_l').value='Arjun'");
		js.executeScript("document.getElementById('u_0_n').value='Krishna'");
		
		
		//Identify text box using javascript when ID was not presented..
		WebElement Mobile_or_Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='ArjunKrishna@gmail.com'", Mobile_or_Email);
		
		
		
		//Select Dropdown Option When element have id property.
		js.executeScript("document.getElementById('day').value='15'");
		js.executeScript("document.getElementById('month').value='8'");
		
		//Identify Dropdown using javascript When ID was not presented.
		WebElement Year_DD=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		js.executeScript("arguments[0].value='1990'", Year_DD);
		
		
		//identify radio button
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].click()", Female_Rbtn);
		Thread.sleep(5000);
		
		//identify radio button
		WebElement male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].checked='true'", male_Rbtn);
		Thread.sleep(5000);
		
		
		
		
	}
}
