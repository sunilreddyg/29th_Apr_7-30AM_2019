package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Click_Inside_Static_Cell_Using_Row_Refferal {

	public static void main(String[] args) 
	{
		
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
		
		//Find list of rows avilable under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
				
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each dynamic row
			WebElement DynamicRow=rows.get(i);
			//Get Each Dynamic Row Text
			String RowText=DynamicRow.getText();
			
			//Accept condition on Expected Record found
			if(RowText.contains("HDFC"))
			{
				System.out.println("Record available at Row number => "+i);
				//Find list of cells under selected row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target seventh cell
				cells.get(9).findElement(By.tagName("a")).click();
				break; //Stop iteration after click inSide cell.
		
			}
			
			
		}//for
		
		
		
		

	}

}
