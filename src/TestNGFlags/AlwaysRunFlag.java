package TestNGFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag { 
	
	@Test
	public void login()
	{
		Reporter.log("login",true);

	}

	@Test(dependsOnMethods = "login")
	public void createUser()
	{
		Assert.fail();
		Reporter.log("Create user",true);

	}

	@Test(dependsOnMethods = "createUser",alwaysRun = true) //alwaysRun:It is use to run testcase regardless of the status of the method on which it is dependent
	public void logout()
	{

		Reporter.log("logout",true);
	}
	
	
}
