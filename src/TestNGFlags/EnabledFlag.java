package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	@Test(enabled=true) //enabled:It is used to disabled particular method
	public void login()
	{
		Reporter.log("Login method executed", true);
	}
	@Test(enabled=false)
	public void logout()
	{
		Reporter.log("Logout method executed", true);
	}
	@Test
	public void dashboard()
	{
		Reporter.log("Dashboard method executed", true);
	}
}
