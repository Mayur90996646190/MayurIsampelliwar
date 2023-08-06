package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {
	@Test
	public void a()
	{	
		Reporter.log("hi",true);
	}
	@Test
	public void d()
	{	
		Reporter.log("sheela",true);
	}
	@Test
	public void b()
	{	
		Reporter.log("Neela",true);
	}
	@Test
	public void v()
	{	
		Reporter.log("leela",true);
	}
	
	@Test
	public void m()
	{	
		Reporter.log("mayur",true);
	}
}
