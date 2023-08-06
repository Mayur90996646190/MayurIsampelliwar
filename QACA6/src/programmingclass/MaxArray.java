package programmingclass;

public class MaxArray {
	public static void main(String[] args) {
		int[] a = {90,10,95,60,70,92};
		int max = a[0];
		int max1 = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(max<a[i])
			{
				max = a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(max1<a[i])
			{
				if(!(a[i]== max))
				{
					max1=a[i];
				}
			}
			
		}
		
		
		System.out.println(max + " max value");
		System.out.println(max1 + " 2nd max value");
	}
}
