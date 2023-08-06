package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class CF2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pass the no of Fruits");
		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			// sc.next();
			System.out.println("Pass the fruit names");
			String fruit = sc.next();
			al.add(fruit);
		}
		System.out.println(al);

	}

}
