package programmingclass;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of name going to store");
		int size = sc.nextInt();
		String[] name = new String[size];
		sc.nextLine();
		for(int i=0; i<name.length; i++ )
		{	
			System.out.println("please enter the name of person");
			name[i] = sc.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
}
