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

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class PrintAllSelectedAlphabet2 {
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
		
		System.out.println(ls);
		HashSet set = new HashSet(ls);
		System.out.println(set);

		TreeSet set1 = new TreeSet(ls);
		System.out.println(set1);
		/*public boolean equals(Object[] obj)
			{
				String[] st = (String[])obj;
				return this.s1[i] == st.s2[j];

			}
		 */
		

		for(int i =0; i<count; i++) {
			
			String[] s1 = new String[count];
			for (int j = 0; j < s1.length; j++) {
				s1[j] = mtrOption.get(j).getText();
			}
				for(int j =0; j<count; j++)
				{
					String[] s2 =new String[count];
					for (int a = 0; a < s1.length; a++) {
						s2[a] = mtrOption.get(a).getText();
					}
					
					if(s1[i].equals(s2[j]))
					{
						System.out.println(s1[i]);
					}
				}			


	}
	driver.close();
}
}
