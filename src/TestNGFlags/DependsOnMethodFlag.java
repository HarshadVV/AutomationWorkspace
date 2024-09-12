package TestNGFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodFlag {

	@Test
	public void signup()
	{
		Reporter.log("Signup ", true);
	}
	
	@Test(dependsOnMethods="signup")//dependendsOnMethods:It is used for one method which need to be run after other method
	public void createUser()
	{
		Reporter.log("CreateUser", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="createUser")
	public void logout()
	{
		Reporter.log("Logout", true);
	}
}
