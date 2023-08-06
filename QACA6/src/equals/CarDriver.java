package equals;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car("Tata", "pink", 50000);
		Car c2 = new Car("Tata", "pink", 50000);
		System.out.println(c1.equals(c2));
	}

}
