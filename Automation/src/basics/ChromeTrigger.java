package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTrigger {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/appearance");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("bar")).click();
	}
}
