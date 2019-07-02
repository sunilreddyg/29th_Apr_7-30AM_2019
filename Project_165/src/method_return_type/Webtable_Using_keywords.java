package method_return_type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords 
{
	
	public static void main(String args[])
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
		obj.load_webpage(url);
		obj.set_timeout(30);
		
		//click market links
		obj.Click_element(By.xpath("(//a[contains(.,'markets')])[1]"));
		
		
		WebElement Cell=obj.Get_Static_Webtable_Cell("//div[@id='pnl_Bse']/table", 4, 3);
		String HighPrice=Cell.getText();
		System.out.println("high price value is => "+HighPrice);
		
		
		//Target Dynamic Cell using referral record name or text.
		WebElement DCell=obj.Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table", "HDFC", 7);
		DCell.findElement(By.tagName("a")).click();
		
	}

}
