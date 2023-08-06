package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.className("Y5N33s"));
		int count = allSugg.size();
		System.out.println(count);
		for (WebElement webElement : allSugg) {
			System.out.println(webElement.getText());
		}
		driver.close();
		
	}
}
