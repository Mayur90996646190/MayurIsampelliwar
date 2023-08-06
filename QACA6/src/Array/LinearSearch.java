package Array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {10,40,60,70,80};
		int search = 12;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==search)
			{	
				count++;
			}
		}
		if(count == 1)
			System.out.println(search + " is present in the array");
		else
			System.out.println(search + " is not present in the array");
	}
}
