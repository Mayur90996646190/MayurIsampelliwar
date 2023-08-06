package handlingListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/Handling%20MultiSelect.html");
		WebElement slvLinkbox=driver.findElement(By.id("slv"));
		Select s =new Select(slvLinkbox);
		 List<WebElement> slvOption = s.getOptions();
		for (WebElement webElement : slvOption) {
			String text = webElement.getText();
			System.out.println(text);
	    }

	}
}
