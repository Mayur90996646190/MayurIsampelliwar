package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByActionClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		//JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,3000)");
		Actions a = new Actions(driver);
		a.moveByOffset(0, 3000).perform();
		
	}
}