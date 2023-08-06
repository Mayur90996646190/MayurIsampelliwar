package com.actitimetestscript1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic1.BaseClass;
@Listeners(com.actitime.generic1.ListenerImplementation.class)

public class CreateCustomer extends BaseClass {
	@Test
	public void createCustomer() {
		Reporter.log("Write",true);
		Assert.fail();
	}
}
