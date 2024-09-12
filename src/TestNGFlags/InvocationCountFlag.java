package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
  @Test(invocationCount=10) //invocationCount:It is used to execute particular test multiple time
  public void login() 
  {
	  Reporter.log("Login method executed",true);
  }
  @Test(invocationCount=5) 
  public void logout() 
  {
	  Reporter.log("Logout method executed",true);
  }
  @Test(invocationCount=0) 
  public void dashboard() 
  {
	  Reporter.log("Dashboard method executed",true);
  }
}
