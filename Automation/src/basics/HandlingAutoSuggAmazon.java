package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggAmazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count = allSugg.size();
		System.out.println(count);
		for(int i=0; i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
	}
}
