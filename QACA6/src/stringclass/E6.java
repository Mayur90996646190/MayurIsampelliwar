package stringclass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E6 {
	public static FileOutputStream createFile(String path) throws FileNotFoundException {
		System.out.println("From Create Method");
		FileOutputStream fout = new FileOutputStream(path);
		return fout;
	}

}
