package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class DemoD{
	static void testA(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		//driver.get("https:/www.gmail.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
class DemoE{
	static void testA(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		//driver.get("https:/www.gmail.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}

public class DemoC {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		DemoA.testA(driver);
		WebDriver driver1 = new FirefoxDriver();
		DemoA.testA(driver1);
	}
}
