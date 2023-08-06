package programmingclass;

public class SelectionSort1 {
	public static void main(String[] args) {
		int[] a = {50,60,20,45,30,48};
		for(int i=0; i<a.length; i++)
		{
			int pos = i;
			for(int j=0; j<a.length; j++)
			{
				if(a[j]>a[pos])
				{
					pos = j;
				}
			}
			if(pos!=i)
			{
				int temp = a[i];
				a[i] = a[pos];
				a[pos] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
