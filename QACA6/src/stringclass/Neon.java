package stringclass;

public class Neon {
	public static void main(String[] args) {
		int num = 9;
		int temp = num;
		int sum = 0;
		int sq = num * num;
		while (sq > 0) {
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}
		if (sum == temp)
			System.out.println("is Neon Number");
		else
			System.out.println("is not Neon Number");
	}

}
