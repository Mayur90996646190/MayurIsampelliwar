package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallLinks2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/demo.html");
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
		driver.close();	
	}
}