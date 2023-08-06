package programmingclass;

import java.util.Scanner;

public class ArrayToStoreCharacter {
	public static void main(String[] args) {
		System.out.println("Enter the size of an Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char[] ch = new char[size];
		 sc.nextLine();
		for(int i=0; i<ch.length; i++)
		{	System.out.println("Enter the character to the Array");
			ch[i] = sc.nextLine().charAt(0);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
