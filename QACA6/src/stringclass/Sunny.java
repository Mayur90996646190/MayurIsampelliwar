package stringclass;

public class Sunny {
	public static void main(String[] args) {
		int num = 24;
		int i = 1;
		int count = 0;
		while (i < num) {
			if (i * i == num + 1) {
				count++;
				break;
			}
			i++;

		}
		System.out.println(count);
	}

}
