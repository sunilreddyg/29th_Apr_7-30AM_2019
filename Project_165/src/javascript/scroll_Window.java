package javascript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scroll_Window
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		//browser initiation
		System.setProperty("webdriver.chrome.driver","D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		//To scroll windod vertical.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(100,800)");
	   Thread.sleep(4000);
	   
	   //To Scroll horizonal.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
	    
	}

}
