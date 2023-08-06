package programmingclass;

import java.util.Arrays;

public class DummyPrac {
	public static void main(String[] args) {
		int[] a = {50,20,40,90,60};
		Arrays.sort(a);
		int low =0;
		int high=a.length-1;
		int count =0;
		int key = 40;
		
		while(low<=high)
		{	int mid = (low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key<a[mid])
			{
				high = mid - 1;
			}
			else
				low = mid + 1;
		}
		if(count==1)
			System.out.println(key + " is present in array");
	}
}
