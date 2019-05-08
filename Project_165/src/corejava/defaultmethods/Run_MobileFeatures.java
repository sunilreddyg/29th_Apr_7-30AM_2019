package corejava.defaultmethods;

public class Run_MobileFeatures 
{

	public static void main(String[] args)
	{
		
		/*
		 * default methods to call from different class.
		 * 	Syntax:-->
		 * 				Classname obj=new Classname();
		 * 				obj.methodname();
		 */
		
		Mobile_Features obj=new Mobile_Features();
		obj.Call();
		obj.Sms();
	}

}
