package exceptions1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E4 {
	public static FileOutputStream createFile(String path) throws FileNotFoundException
	{
		FileOutputStream fout = new FileOutputStream(path);
		return fout;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main Begin");
		createFile("K:\\Eclipse/f1.text");
		System.out.println("Main End");
	}
}
