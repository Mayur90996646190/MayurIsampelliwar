package comparable;

import java.util.Arrays;
import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of object to be stored");
		int size = s.nextInt();
		Human[] h = new Human[size];
		for (int i = 0; i < size;) {
			s.nextLine();
			System.out.println("Enter name of the Human");
			String name = s.nextLine();
			System.out.println("Enter height of human");
			double Height = s.nextDouble();
			System.out.println("Enter weight of human");
			double weight = s.nextDouble();
			h[i] = new Human(Height, name, weight);
			System.out.println(++i + "Human object are created");
		}

		Arrays.sort(h, new SortByHeight());
		for (int i = 0; i < size; i++) {
			System.out.println(h[1]);
		}
		Arrays.sort(h, new SortByWeight());
		for (int i = 0; i < size; i++) {
			System.out.println(h[i]);
		}

	}

}
