package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F3 {
	public static void main(String[] args) throws IOException {
		String path = "K:\\Eclipse\\QACA6\\filehandling\\sheela.text";
		FileOutputStream fout = new FileOutputStream(path);
		char ch = 'M';
		fout.write(ch);
		fout.close();
	}
}
