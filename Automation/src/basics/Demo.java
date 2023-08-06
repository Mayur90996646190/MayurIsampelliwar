package basics;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		String driver1 = driver.getTitle();
		System.out.println(driver1);
		driver.close();
	}
}
