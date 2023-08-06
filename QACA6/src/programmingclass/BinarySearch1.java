package programmingclass;

import java.util.Arrays;

public class BinarySearch1 {
	public static void main(String[] args) {
		int[] a = {50,40,20,80,10,30};
		Arrays.sort(a);
		System.out.println("Before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int count =0;
		int key = 80;
		int low = 0;
		int high = a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key<a[mid])
			{
				high = mid-1;
			}
			else
				low = mid+1;
		}
		if(count==1)
			System.out.println(key + " is found");
		else
			System.out.println(key + " is not found");
		
	}
}
