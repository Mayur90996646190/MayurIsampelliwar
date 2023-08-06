package handlingListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement monthLinkbox = driver.findElement(By.id("month"));
		Select s = new Select(monthLinkbox);
		s.selectByIndex(11);
		Thread.sleep(3000);
		s.selectByValue("3");
		Thread.sleep(4000);
		s.selectByVisibleText("Feb");
	}
}
