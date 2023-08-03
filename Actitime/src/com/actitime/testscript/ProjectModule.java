package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass {
	@Test
	public void testCreateProjectModule() throws EncryptedDocumentException, IOException{
		FileLib f=new FileLib();
		String ProjectName = f.getExcelData("createProject", 1, 3);
		String projectDesc=f.getExcelData("createProject", 1, 4);
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProjectBtn().click();
		t.getProjectNameTbx().sendKeys(ProjectName);
		t.getSelectCustomerDDProject().click();
//		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class='customerLabel']/../../..//div[@class='itemRow cpItemRow ']"));
//		for(WebElement sugg : alllist)
//		{
//			if(sugg.getText().equalsIgnoreCase(f.getExcelData("CreateCustomer", 1, 3)))
//			{
//				sugg.click();
//			}
//		}
		t.getSelectBeforeCreatedCustomer().click();
		t.getProjectDescriptiontbx().sendKeys(projectDesc);
		t.getCreateProjectBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualProjectCreated(), ProjectName));
		String actualText = t.getActualProjectCreated().getText();
		Assert.assertEquals(actualText, ProjectName);
		
		
		
	}
}
