package corejava.Array;

public class Static_Array 
{

	public static void main(String[] args) 
	{
		
		//Single dimensional  [Static Araay]
		String arr[]=new String[4];
		arr[0]="IDE";
		arr[1]="WD";
		arr[2]="GRID";
		arr[3]="RC";
		
		
		System.out.println("2nd index value is => "+arr[2]);
		
		
		//Get Array length 
		int Count=arr.length;
		System.out.println("Array length in integer format is => "+Count);
		
		
		//Apply forloop to iterate expected range.
		for (int i = 0; i < Count; i++) 
		{
			 String toolname=arr[i];
			 System.out.println("=> "+toolname);
		}
		
		
		
		
		
		

	}

}
