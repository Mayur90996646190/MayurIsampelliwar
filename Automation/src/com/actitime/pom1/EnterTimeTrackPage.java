package com.actitime.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath = "//input[@placeholder='Add task by name']")
	private WebElement addname;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		logout.click();
	}
	public void addName() {
		addname.click();
	}
}
