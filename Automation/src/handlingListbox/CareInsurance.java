package handlingListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		
		
		
		driver.findElement(By.id("dob")).click();
		WebElement yearbox = driver.findElement(By.className("ui-datepicker-year"));
		yearbox.click();
		Select s1 = new Select(yearbox);
		Thread.sleep(3000);
		s1.selectByValue("1998");
		
		Thread.sleep(3000);
		
		WebElement monthbox = driver.findElement(By.className("ui-datepicker-month"));
		monthbox.click();
		//WebElement dobbox =driver.findElement(By.id("dob"));
		Select s = new Select(monthbox);
		Thread.sleep(3000);
		s.selectByValue("0");
		driver.findElement(By.xpath("//a[text() ='27']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9854494663");
		driver.findElement(By.className("submit-login"));
		
		
		}
}
