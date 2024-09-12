package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DecriptionFlag {
	
	@Test(description="This is login method")  //description:It is used to give description of method 
	public void login()
	{
		Reporter.log("Login method is exceuted", true);;
	}

}
