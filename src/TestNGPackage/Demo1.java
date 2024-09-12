package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	

	@Test
	void test1()
	{
		Reporter.log("test1 method excuted",true);
	}
	//By using the "Reporter.log("string", true)"  we can generate a report in forms of HTMl structure
	//"string": This is the message you want to log.
	//true: This boolean flag indicates whether the log message should also be printed to the console.
	
	@Test
	void test2()
	{
		Reporter.log("test2 method excuted",true);
	}
	
	@Test
	void test3()
	{
		Reporter.log("test2 method excuted",false);
	}
}
