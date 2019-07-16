package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_DataProviderMethod_From_DiffClass 
{

	
	@Test(dataProvider="user_data",dataProviderClass=InputDP.class)
	public void verify_Test_With_userData(String UID,String MOBILE)
	{
		
	}
}
