package stringclass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E7 {
	public static FileOutputStream CreateFile(String path) throws FileNotFoundException {
		System.out.println("From Create Method");
		FileOutputStream fout = new FileOutputStream(path);
		return fout;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main Begin");
		CreateFile("K://F1.txt");
		System.out.println("Main End");

	}

}