package Array;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] a = { 40,50,10,20,40};
		for (int i = 0; i < a.length; i++) {
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
