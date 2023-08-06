package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/demo.html");
		//WebElement e = driver.findElement(By.cssSelector("a[id = 'd1']"));
		//WebElement e = driver.findElement(By.cssSelector("a[class = 'c1']"));
		//WebElement e = driver.findElement(By.cssSelector("a[name = 'n1']"));
		WebElement e = driver.findElement(By.cssSelector("a[href ='https://www.qspiders.com']"));
		e.click();
		driver.close();
		
	}
}
