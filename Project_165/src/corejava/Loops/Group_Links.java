package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{

		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
			
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Store set of links into runtime array..
		String links[]={"Sign Up","Log In","Messenger","Events","Games","Create Page"};
		
		//iterate for expected array length 
		for (int i = 0; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(3000);
			
			System.out.println(links[i]+" -->  runtime title is => "+driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			
		}
		

	}

}
