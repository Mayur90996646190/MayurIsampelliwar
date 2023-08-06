package handlingListbox;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/FileUpload.html");
		Thread.sleep(3000);
		File f =new File("‪K:\\mayur c program/a.exe");
		String absPath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absPath);
	}
}
