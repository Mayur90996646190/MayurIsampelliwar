package programmingclass;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {10,60,90,50,65};
		int high = a.length-1;
		int low = 0;
		int key = 60;
		int count=0;
		while(low<=high)
		{	
			int mid = (low+high)/2;
			if(a[mid] == key)
			{
				count++;
				break;
			}
			else if(key<a[high])
			{
				high=mid-1;
			}
			else
				low = mid+1;
		}
		if(count==1)
			System.out.println("p");
		else
			System.out.println("not p");
	}
}
