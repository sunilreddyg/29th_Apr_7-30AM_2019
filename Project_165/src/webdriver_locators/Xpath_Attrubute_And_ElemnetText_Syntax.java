package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Attrubute_And_ElemnetText_Syntax {

	public static void main(String[] args) throws Exception 
	{
		//Browser Intiation
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * identify Location using element text
		 * HtmlSource:-->
		 * 		<button id="cjaMain">Create a Job Alert</button>
		 * Syntax:--.
		 * 		//tagname[text()='ElementText']
		 * 
		 * Note:-->
		 * 		text()  or .[dot] keywords target Element Text area at hmtl-node
		 */
		
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * Identify location using Element Attributes
		 * HtmlSource:-->
		 * 			<input class="sugInp" name="keyskills" type="text">
		 * Syntax:-->
		 * 			//tagname[@Propertyname='PropertyValue']
		 * 
		 *  Note:-->
		 *  		@ symbol identify only attributes at html-node
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(3000);  //To load suggesions.

		
		//identify location using Element-text 
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(3000);  //To load next suggesion.
		
		
	}

}
