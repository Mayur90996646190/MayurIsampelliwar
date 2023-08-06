package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E3 {
	
		public static FileOutputStream createFile(String path)
		{	try
			{
				System.out.println("From createFile method");
				FileOutputStream fout = new FileOutputStream(path);	
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Exception is handled");
			}
		return null;
		}
	


	public static void main(String[] args)  {
		System.out.println("Main Begin");
		createFile("K://Eclipse//QACA6//src//exceptions//F1.text");
		//K:\\Eclipse\\QACA6\\src\\exceptions\\F1.text
		System.out.println("Main End");	
	}
}
