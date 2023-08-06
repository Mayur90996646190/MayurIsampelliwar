package handlingListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDivisionPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		driver.close();
		
	}
}
