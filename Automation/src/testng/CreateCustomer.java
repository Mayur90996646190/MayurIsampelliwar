package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	@Test(priority = 2)
	public  void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=1 , dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test(dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
