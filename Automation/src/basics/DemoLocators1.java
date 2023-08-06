package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/demo.html");
		WebElement e = driver.findElement(By.className("c1"));
		e.click();
		driver.close();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/demo.html");
		WebElement e1 = driver.findElement(By.className("c1"));
		e1.click();
		
		
	}
}
