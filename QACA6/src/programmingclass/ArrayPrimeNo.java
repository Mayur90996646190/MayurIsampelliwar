package programmingclass;

public class ArrayPrimeNo {
	public static void main(String[] args) {
		int[] a = {15,18,23,50,7,11};
		boolean res = ArrayPrimeNo.isPrime(a);
		if(res==true)
			System.out.println("array consist of an prime no");
		else
			System.out.println("array not consist of an prime no");
	}
	public static boolean isPrime(int[] a)
	{
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 2; j < a.length; j++) {
				if(a[i]%j==0)
				{
					count++;
					break;
				}
			}
		}
		if(count==1)
			return false;
		else
			return true;
	}
}
