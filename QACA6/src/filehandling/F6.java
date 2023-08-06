package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class F6 {
	public static void main(String[] args) throws IOException {
		String path = "K:\\Eclipse\\QACA6\\src\\Array\\Max.java";
		FileInputStream fin = new FileInputStream(path);
		byte[] b =new byte[fin.available()];
		fin.read(b);
		for(byte c:b)
		{
			System.out.print((char)c);
		}
		
	}
}
