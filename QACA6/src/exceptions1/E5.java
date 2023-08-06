package exceptions1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E5 {
	public static FileOutputStream createFile(String path) throws FileNotFoundException
	{	FileOutputStream fout = new FileOutputStream(path);
		return  fout;
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("file has been Created");
		createFile("K:\\\\Eclipse/f2.text");
	}
}
