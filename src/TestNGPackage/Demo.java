package TestNGPackage;

import org.testng.annotations.Test;

public class Demo {
	/*
	 1.Open Application
	 2.Login
	 3.Logout
	 */
	@Test
	void OpenApp()
	{
		System.out.println("Launching the application...");
	}

	@Test
	void Login()
	{
		System.out.println("Login the application...");
	}
	
	@Test
	void Logout()
	{
		System.out.println("Logout from the application...");
	}
}



