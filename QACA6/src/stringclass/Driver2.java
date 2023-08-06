package stringclass;

public class Driver2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "smith", 8000);
		System.out.println(e1.sal);
		Employee e2 = new Employee(100, "Millers", -8000);
		System.out.println(e1.sal);
	}

}
