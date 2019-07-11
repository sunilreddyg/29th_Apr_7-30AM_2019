package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Method_Ignore 
{
  @Test  //Invoke method executino
  public void tc001() 
  {
	  Reporter.log("tc001 executed",true);
  }
  
  
  @Test(enabled=false)  //it ignore method execution
  public void tc002() 
  {
	  
  }
  
  
}
