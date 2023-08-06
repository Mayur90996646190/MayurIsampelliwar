package Array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {20,50,40,30,60};
		Arrays.sort(a);
		int key =60;
		int count = 0;
		int low = 0;
		int high =a.length-1;
		while(low<=high)
		{	int mid = (low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key<mid)
			{
				high = mid-1;
			}
			else
				low = mid+1;
		}
		if(count == 1)
			System.out.println(key + " present");
	}
}
