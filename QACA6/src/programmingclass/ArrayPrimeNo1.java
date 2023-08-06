package programmingclass;

public class ArrayPrimeNo1 {
	public static void main(String[] args) {
		int[] a = { 15, 18, 23, 50, 7, 11 };
		for (int i = 0; i < a.length; i++) {
			boolean res = isPrime(a[i]);
			if (res == true)
				System.out.println(a[i]);
		}
	}
	public static boolean isPrime(int n) {
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
