package programmingclass;

public class ArrayReverse {
	public static void main(String[] args) {
		int [] a = {10,20,50,60,70};
		int i=0;
		int j= a.length-1;
		System.out.println("before reverse");
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2] + " ");
		}
		System.out.println();
		while(i<j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("after reverse");
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2 ]+ " ");
		}
		
	}
}
