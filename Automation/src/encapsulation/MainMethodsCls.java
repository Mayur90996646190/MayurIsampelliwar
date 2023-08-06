package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgBtn;
	LoginPage(WebDriver driver)
	{
		untbx = driver.findElement(By.id("username"));
		pwtbx = driver.findElement(By.name("pwd"));
		lgBtn = driver.findElement(By.xpath("//div[text() = 'Login ']"));
	}
	void setUser(String un,String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();
	}
}

public class MainMethodsCls {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage(driver);
		l.setUser("admin", "manager");
	}
}
