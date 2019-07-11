package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
  @Test //invoke method execution
  public void tc001() 
  {
	  Reporter.log("tc001 executed");
  }
  
  @Test //invoke method execution
  public void tc002() 
  {
	  Reporter.log("tc002 executed");
  }
  
  @Test //invoke method execution
  public void tc003() 
  {
	  Reporter.log("tc003 executed");
  }
  
  
}
