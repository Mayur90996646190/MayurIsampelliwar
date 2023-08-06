package com.actitimetestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CreateModule extends BaseClass {
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		Assert.fail();
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
