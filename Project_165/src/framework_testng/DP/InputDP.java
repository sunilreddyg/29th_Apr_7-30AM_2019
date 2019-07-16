package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputDP 
{
  @Test(dataProvider="dp",enabled=false)
  public void tc001(Integer n, String s) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  
  
  
  
  
  
  /*
   * Note:--> inorder to use dataprovider data in diff class
   * 		 we must declare dataprovider method with static access specifier..
   */
  
  @DataProvider
  public static Object[][] user_data() 
  {
    return new Object[][] 
    {
      new Object[] {"user1","9030248855" },
      new Object[] {"user2","9030848855" },
      new Object[] {"user3","9451245785" },
      new Object[] {"user4","9451245776" },
    };
  }

  @Test(dataProvider="user_data")
  public  void tc002(String UID,String MOBILE)
  {
	  System.out.println(UID+"  "+MOBILE);
  }
  
  
}
