package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass {
	@Test
	public static void taskModule() {
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();	
		t.getNewTaskBtn().click();
		t.getTaskCustomerDD().click();
		t.getTaskCustomerSelect().click();
		t.getTaskProjectDD().click();
		t.getTaskSelectProject().click();
		t.getTaskTaskTbx1().sendKeys("Qspider Training Institute");
		t.getCreateTasksButton().click();
		
	}
}

