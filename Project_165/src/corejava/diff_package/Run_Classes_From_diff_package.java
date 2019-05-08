package corejava.diff_package;

import corejava.defaultmethods.Mobile_Features;
import corejava.staticmethods.InputDevices;

public class Run_Classes_From_diff_package 
{

	public static void main(String[] args)
	{
		//Default methods to call	
		Mobile_Features obj=new Mobile_Features();
		obj.Call();
		obj.Sms();
		
		
		//Static methods to call from diff package
		InputDevices.Keyboard();
		InputDevices.Mouse();

	}

}
