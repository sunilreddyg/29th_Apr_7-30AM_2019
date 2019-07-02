package method_return_type;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object repository..
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.co");
		obj.set_timeout(30);
		
		//Verify title presented at webpage
		if(obj.is_title_presented("Facebook"))
			System.out.println("expected title presented");
		else
			System.out.println("wrong tilte presented");
		
		
		//Verify url presented at webpage
		if(obj.isUrl_Presented("https://www.facebook.com/"))
			System.out.println("Expected url presented");
		else
			System.out.println("Wrong url presented");

		//Write decision to verify alert presented
		obj.CloseAlert();
		
		
		
		
	}

}
