package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitAdd {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("please pass no of fruit are present");
		int n =sc.nextInt();
		for(int i=0; i<n;i++)
		{
			System.out.println("please pass an fruit name");
			ls.add(sc.next());
		}
		System.out.println(ls);
	}
}
