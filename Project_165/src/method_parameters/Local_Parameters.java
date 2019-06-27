package method_parameters;

public class Local_Parameters
{
	
	//method without parameters..
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println("Toll name is => "+name);
	}
	
	
	//Method with single parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println("Toll name is => "+name);
	}
	
	//Method with single parameter
	public void print_tool(String toolname,double version)
	{
		String name=toolname;
		System.out.println("Toll name is => "+name+"  and  Version is => "+version);
	}
		
	

	public static void main(String[] args) 
	{
		
		//Create object for Class
		Local_Parameters obj=new Local_Parameters();
		//calling method without argument.
		obj.print_tool();
		
		//calling method with single arguments
		obj.print_tool("IDE");
		obj.print_tool("Appium");
		
		//Calling methdo with multipel arguments
		obj.print_tool("WebDriver",3.14);
		

	}

}
