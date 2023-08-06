package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/demo.html");
	    WebElement e =driver.findElement(By.tagName("a"));
		//WebElement e = driver.findElement(By.id("d1"));
		//WebElement e = driver.findElement(By.name("n1"));
		//WebElement e = driver.findElement(By.className("c1"));
		//WebElement e = driver.findElement(By.linkText("Google"));
		//WebElement e = driver.findElement(By.partialLinkText("Goo"));
		e.click();
		
	}
}
