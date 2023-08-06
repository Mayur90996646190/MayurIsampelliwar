package equals;

public class case1 {
	public static void main(String[] args) {
		H1 obj = new H1(10);
		H1 obj1 = new H1(20);
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode() == obj1.hashCode());
		System.out.println(obj.toString());

	}
}
