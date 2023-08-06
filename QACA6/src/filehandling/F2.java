package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String path = sc.nextLine();
		FileOutputStream fout = new FileOutputStream(path+"/f2.text");
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		fout.write(ch);
		fout.close();
	}
}
