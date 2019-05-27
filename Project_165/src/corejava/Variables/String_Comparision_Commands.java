package corejava.Variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args)
	{
		
		
		/*
		 * String:-->
		 * 		=> String is not only a datatype and also called as
		 * 			class.Because String contains set of behaviours to
		 * 			manipulate store characters...
		 */
		String  Exp_result="please enter username";
		String  Act_result="Please Enter Username";
		
		
		/*
		 * Equals:-->
		 * 		  Method verify equal comparision between two strings
		 * 		  and return boolean value true/false.
		 */
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		/*
		 * EqualsIngoreCase:-->
		 * 		Method verify equal comparision between any two string
		 * 		by ignoring casesensitive.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("equal ignorecase comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify sequence of partial characters available
		 * 		at main String.
		 */
		String Status="Forgotten password?";
		boolean flag2=Status.contains("password?");
		System.out.println("Sub String status is => "+flag2);
		
		
		/*
		 * length:-->
		 * 		Method return number of charactes count in String.
		 */
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println("total characters in mobile number is => "+len);
		
		
		/*
		 * SubString:-->
		 * 		Method get sub String chracters from main String
		 */
		String Account_Num="0000123455551111";
		String last_digits=Account_Num.substring(12);
		System.out.println("Account last four digit numbers are => "+last_digits);
		
		String start_digits=Account_Num.substring(0, 4);
		System.out.println("Accout Start digits numbers are => "+start_digits);
		
		
		
		
		

	}

}
