package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dragdrop.com");
		WebElement src = driver.findElement(By.id("Block 1"));
		WebElement dest = driver.findElement(By.id("Block 4"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
}
