package com.actitimetestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementatiion.class)

public class TaskModule1 extends BaseClass {
	
	@Test(groups = {"smokeTest","regressionTest"})
	public void createTask() {
		Reporter.log("createTask",true);
	}
	
	@Test(groups = "regressionTest")
	public void deleteProject() {
		Reporter.log("deleteTask",true);
	}
	@Test(groups = "regressionTest")
	public void modifyProject() {
		Reporter.log("deleteTask",true);
	}
}
