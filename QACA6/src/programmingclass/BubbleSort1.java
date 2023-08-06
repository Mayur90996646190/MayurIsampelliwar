package programmingclass;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] a = {50,40,55,20,65};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
