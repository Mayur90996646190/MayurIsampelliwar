package handlingListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/Handling%20MultiSelect.html");
		WebElement mtrLinkbox=driver.findElement(By.id("mtr"));
		Select s =new Select(mtrLinkbox);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("dosa");
		Thread.sleep(3000);
		s.deselectByVisibleText("dosa");
		Thread.sleep(3000);
		s.deselectByValue("v");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		Thread.sleep(5000);
		System.out.println(s.isMultiple());
		
		
		
		driver.close();
	}
}
