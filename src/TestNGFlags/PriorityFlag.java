package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
	
	@Test(priority=3) //priority:
	public void h()
	{
		Reporter.log("h", true);
	}

	@Test(priority=-1)
	public void z()
	{
		Reporter.log("z", true);
	}
	
	@Test(priority=3)
	public void n()
	{
		Reporter.log("n", true);
	}
	
	@Test(priority=2)
	public void a()
	{
		Reporter.log("a", true);
	}
	@Test(priority=3)
	public void b()
	{
		Reporter.log("b", true);
	}
	@Test
	public void d()
	{
		Reporter.log("d", true);
	}
	@Test(priority=0)
	public void g()
	{
		Reporter.log("z", true);
	}
}
