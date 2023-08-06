package practise;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(practise.ListenerImplementationPractice.class)
public class CustomerModule extends BaseClassPractice {
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
