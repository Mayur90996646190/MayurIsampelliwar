package stringclass;

public class Strong {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int fact = 1;
			int rem = num % 10;
			while (rem > 0) {
				fact = fact * rem;
				rem--;
			}
			sum = sum + fact;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("is strong no");
		} else
			System.out.println(" is not ");
	}

}
