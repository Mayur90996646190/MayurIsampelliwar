package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrollBar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		WebElement w =driver.findElement(By.xpath("//span[text()='Future Planet']"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
	}
}
