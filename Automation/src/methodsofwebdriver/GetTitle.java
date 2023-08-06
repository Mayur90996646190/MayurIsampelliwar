package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
