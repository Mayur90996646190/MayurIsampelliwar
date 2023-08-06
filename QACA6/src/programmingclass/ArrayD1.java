package programmingclass;

import java.util.Scanner;

public class ArrayD1 {
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
