package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_GroupLInks_At_location 
{

	public static void main(String[] args) throws Exception 
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
		//Browser initiation	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		
		//Identify Footer links area
		WebElement Footer_Navigaions;
		Footer_Navigaions=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		
		//Identif Group of links under navigation area
		List<WebElement> All_links;
		All_links=Footer_Navigaions.findElements(By.tagName("a"));

		//Iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//Target each link
			WebElement Each_link=All_links.get(i);
			
			//Get linkname and linkhref
			String linkname=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			
			System.out.println(linkname+"   => "+linkhref);
			
			//Click Eachlink
			Each_link.click();
			Thread.sleep(3000);
			

			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all page links to avoid stalelementreference exception..
			Footer_Navigaions=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			All_links=Footer_Navigaions.findElements(By.tagName("a"));

			
		}
		
	}

}
