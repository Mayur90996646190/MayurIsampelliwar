package com.actitimetestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementatiion.class)

public class CustomerModule extends BaseClass {
	
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
		Assert.fail();
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
