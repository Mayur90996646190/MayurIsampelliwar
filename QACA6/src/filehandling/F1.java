package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F1 {
	public static void main(String[] args) throws IOException {
		String path = "K:\\Eclipse\\QACA6\\filehandling";
		FileOutputStream fout = new FileOutputStream(path + "/F1.text");
		char ch = 90;
		fout.write(ch);
		System.out.println("Character has been written in the file");
		fout.close();
		
	}
}
