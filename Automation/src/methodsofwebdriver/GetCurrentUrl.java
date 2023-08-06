package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("Url is navigating successfully and pass");
		}
		else
			System.out.println("url is not Navigating successfully and failed");
		
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);
	}
}
