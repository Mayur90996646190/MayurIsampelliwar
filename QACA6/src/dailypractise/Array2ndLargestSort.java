package dailypractise;

import java.util.Arrays;
//WAJP to find nth largest element using sort method 
public class Array2ndLargestSort {
	public static void main(String[] args) {
		int[] a = {10,5,25,20,35,15,20};
		int n = 3;
		Arrays.sort(a);
		int max = a[a.length-n];
		System.out.println(max);
//		int max2nd =a[a.length-2];
//		System.out.println(max+" is a max");
//		System.out.println(max2nd + " second max");
		
	}
}
