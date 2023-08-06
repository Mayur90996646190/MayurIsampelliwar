package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class F4 {
	public static void main(String[] args) throws IOException {
		String path = "K:\\Eclipse\\QACA6\\filehandling\\sheela.text";
		FileInputStream fis = new FileInputStream(path);
		int data =fis.read();
		char chardata = (char)data;
		System.out.println(chardata);
	}
}
