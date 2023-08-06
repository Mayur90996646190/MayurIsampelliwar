package com.actitimetestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementatiion.class)

public class ProjectModule1 extends BaseClass {
	
	@Test(groups = {"smokeTest","regressionTest"})
	public void createProject() {
		Reporter.log("createProject",true);
	}
	
	@Test(groups = "regressionTest")
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
	@Test(groups = "regressionTest")
	public void modifyProject() {
		Reporter.log("deleteProject",true);
	}
}
