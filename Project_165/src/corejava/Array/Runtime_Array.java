package corejava.Array;

public class Runtime_Array {

	public static void main(String[] args) 
	{
		
		//Singe dimensional  [Runtime array]
		
		String browsers[]={"firefox","chrome","ie","safari"};
		System.out.println("3nd index value is => "+browsers[2]);
		
		
		//Apply for loop
		for (int i = 0; i < browsers.length; i++)
		{
			       String browsername=browsers[i];
			       System.out.println("=> "+browsername);
		}

	}

}
