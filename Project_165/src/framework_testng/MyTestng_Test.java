package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
  @Test
  public void tc001()
  {
	  Reporter.log("tc001 execited");
  }
  
  @Test
  public void tc002()
  {
	  Reporter.log("tc002 execited");
  }
  
  @Test
  public void tc003()
  {
	  Reporter.log("tc003 execited");
  }
  
  
}
