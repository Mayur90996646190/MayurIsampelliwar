package handlingListbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedAlphabet {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shivam%20Ojha/Desktop/Handling%20MultiSelect.html");
		WebElement mtrLinkbox=driver.findElement(By.id("mtr"));
		Select s =new Select(mtrLinkbox);
		List<WebElement> mtrOption = s.getOptions();
		int count = mtrOption.size();
		ArrayList ls = new ArrayList();
		for(int i=0;i<count; i++)
		{
			ls.add(mtrOption.get(i).getText());
		}
		HashSet set = new HashSet(ls);
		System.out.println(set);
		
		TreeSet set1 = new TreeSet(ls);
		System.out.println(set1);
		driver.close();
		int i =0;
		for(String s1 =mtrOption.get(i).getText(); i<count; i++) {
			int j =0;
			for(String s2 =mtrOption.get(j).getText(); j<count; j++)
			{
				if(s1==s2)
				{
					System.out.println(s1);
				}
			}
		}
	}
}
