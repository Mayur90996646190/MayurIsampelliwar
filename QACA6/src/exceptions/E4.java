package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E4 {
	
		public static FileOutputStream createFile(String path) throws FileNotFoundException
		{
				System.out.println("From createFile method");
				FileOutputStream fout = new FileOutputStream(path);	
				return fout;
		}

	public static void main(String[] args) throws FileNotFoundException  {
		System.out.println("Main Begin");
		createFile("K://Eclipse//QACA6//src//exceptions//F2.text");
		//K:\\Eclipse\\QACA6\\src\\exceptions\\F1.text
		System.out.println("Main End");	
	}
}
