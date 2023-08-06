package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F5 {
	public static void main(String[] args) throws IOException {
		String path = "K:\\Eclipse\\QACA6\\filehandling\\Leela.text";
		FileOutputStream fout = new FileOutputStream(path);
		String data = "All the best";
		byte[] b = data.getBytes();
		fout.write(b);
		System.out.println("data has been written");
	}
}
