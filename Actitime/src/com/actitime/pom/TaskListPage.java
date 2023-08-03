package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomerCreated;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement projectNameTbx;
	
	@FindBy(xpath="//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']")
	private WebElement selectCustomerDDProject;
	
	@FindBy(xpath="//div[text()='HDFC_001' and @class='itemRow cpItemRow ']")
	private WebElement selectBeforeCreatedCustomer;
	
	@FindBy(xpath="//body[@class='task_list with-navigation navBottomSpaceHidden  ext-chrome']")
	private WebElement ProjectDescriptiontbx;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[1]")
	private WebElement taskNameProjectTbx1;
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")	
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualProjectCreated;
	
	//TASKPAGE
	@FindBy(xpath = "//div[@class='item createNewTasks']")
	private WebElement newTaskBtn;
	
	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}
	@FindBy(xpath="(//div[@class='emptySelection' and '- Select Customer -' ])[1]")
	private WebElement taskCustomerDD;
	
	@FindBy(xpath="//div[text()='HDFC_001' and @class='text']")
	private WebElement taskCustomerSelect;
	
	@FindBy(tagName = "- Select Project -")
	private WebElement taskProjectDD;
	
	@FindBy(xpath="//div[text()='HDFC Bank' and @class='itemRow cpItemRow selected']")
	private WebElement taskSelectProject;
	
	
	public WebElement getTaskCustomerSelect() {
		return taskCustomerSelect;
	}
	public WebElement getTaskSelectProject() {
		return taskSelectProject;
	}
	@FindBy(xpath= "(//input[@class='inputFieldWithPlaceholder'])[1]")
	private WebElement taskTaskTbx1;
	
	@FindBy(xpath ="//div[text()='Create Tasks']")
	private WebElement createTasksButton;
	
	
	
	public WebElement getActualProjectCreated() {
		return actualProjectCreated;
	}
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() {
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
	
	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}
	public WebElement getProjectNameTbx() {
		return projectNameTbx;
	}
	public WebElement getSelectCustomerDDProject() {
		return selectCustomerDDProject;
	}
	public WebElement getSelectBeforeCreatedCustomer() {
		return selectBeforeCreatedCustomer;
	}
	public WebElement getProjectDescriptiontbx() {
		return ProjectDescriptiontbx;
	}
	public WebElement getTaskNameProjectTbx1() {
		return taskNameProjectTbx1;
	}
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
	public WebElement getTaskCustomerDD() {
		return taskCustomerDD;
	}
	public WebElement getTaskProjectDD() {
		return taskProjectDD;
	}
	public WebElement getTaskTaskTbx1() {
		return taskTaskTbx1;
	}
	public WebElement getCreateTasksButton() {
		return createTasksButton;
	}
	
	
}






