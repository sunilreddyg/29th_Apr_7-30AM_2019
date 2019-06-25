package findelements;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebTable_Specific_Row_And_Cell_Data 
{

	public static void main(String[] args) 
	{
		//example:--> Read data from table using specific row and cell..
		
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
					
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
			
		//click markets link
		WebElement Markets_Tab=driver.findElement
				(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		Markets_Tab.click();
		
	
		//Identify webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find list of rows avaialble under selected table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//target Specific row
		WebElement SelectedRow=rows.get(5);
		
		//Find list of cells under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get Specific Cell data usng index number
		String Stockname=cells.get(0).getText();
		String Highprice=cells.get(3).getText();
		
		System.out.println(Stockname+"    "+Highprice);
	}

}
