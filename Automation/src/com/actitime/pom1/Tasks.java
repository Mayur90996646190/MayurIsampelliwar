package com.actitime.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	@FindBy(id="//div[.='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerBtn;
	
	@FindBy(xpath = "//div[@class='customerInfoDiv']")
	private WebElement customernameTbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTbx;
	
	@FindBy(xpath = "(//input[@type='text'])[28]")
	private WebElement dropdown;
	
	
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigbangcustomerDD;
	
	@FindBy(xpath ="//div[text()='Create Customer']")
	private WebElement createcustomerbtn;
	
	public Tasks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTask(String customername,String description)
	{
		addnewBtn.click();
		newcustomerBtn.click();
		customernameTbx.sendKeys(customername);
		customerDescriptionTbx.sendKeys(description);
		dropdown.click();
		bigbangcustomerDD.click();
		createcustomerbtn.click();
	}
}
