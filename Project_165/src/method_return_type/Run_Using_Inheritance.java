package method_return_type;


public class Run_Using_Inheritance extends Repository
{
	
	
	public void Setup_browser()
	{
		LaunchBrowser("chrome");
		load_webpage("http://facebook.com");
		set_timeout(30);
		
	}
	
	
	public void Close_browser()
	{
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static void main(String args[])
	{
		
		//Create object for Classs
		Run_Using_Inheritance obj=new Run_Using_Inheritance();
		obj.Setup_browser();
		obj.Capturescreen("Newimage.png");
		obj.Close_browser();
		
		
	}

}
