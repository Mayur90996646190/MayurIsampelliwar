package Array;

public class SelectionSort1 {
	public static void main(String[] args) {
		int[] a = {20,50,80,60,70};
		for(int i=0; i<a.length; i++)
		{
			int pos = i;
			for(int j=i+1; j<a.length; j++) // i+1 bcoz aage wala banda chota h but bubble sort me piche banda chota h
			{
				if(a[j] < a[pos])
				{
					pos=j;
				}
			}
			if(pos!=i)
			{
				int temp = a[pos];
				a[pos] = a[i];
				a[i] = temp;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
