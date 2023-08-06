package programmingclass;

import java.util.Arrays;

public class HalfArraySort {
	public static void main(String[] args) {
		int[] a = {8,7,4,5,3,2,1};
		Arrays.sort(a,a.length/2,a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
