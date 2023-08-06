package Array;

import java.util.Arrays;

public class BinarySearch1 {
	public static void main(String[] args) {
		int[] a = {20,50,60,55,70,56};
		Arrays.sort(a);
	
		int key = 59;
		int low =0;
		int high = a.length-1;
		int count =0;
		while(low<=high)
		{
			int mid =(low+high)/2;
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
			System.out.println(key + " is present");
		else
			System.out.println(key + " is not present");
	}
}
