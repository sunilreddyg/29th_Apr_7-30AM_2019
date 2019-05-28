package corejava.Variables.Global;


public class Run_Helper 
{

	public static void main(String[] args) 
	{
		
		//Create object for helper class
		Helper obj=new Helper();
		
	
		//Get Global variable and assign value at runtime
		obj.browser_driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		obj.page_url="http://facebook.com";
		obj.Lanch_chrome_Browser();
		
		//Get Global variables and assign runtime values
		obj.username="qadarshan@gmail.com";
		obj.password="Hello12345";
		obj.User_login_Invalid_password();
		

	}

}
