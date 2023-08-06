package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String un = p.getProperty("un");
		System.out.println(url);
		System.out.println(username);
		System.out.println(un);
	}
}
