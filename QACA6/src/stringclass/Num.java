package stringclass;

public class Num {
	public static void main(String[] args) {
		int num = 1234;
		int temp = num;
		int temp1 = num;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		if (count == 4) {
			int rem = temp % 10;
			System.out.println("if num is 4 digits last digit of num is " + rem);
		} else if (count == 3) {
			temp1 = temp1 / 10;
			int rem1 = temp1 % 10;
			System.out.println("if num is 3 digits 2nd digit of num is " + rem1);
		} else if (count == 2 || count == 1) {
			System.out.println("hi");
		}

	}

}
