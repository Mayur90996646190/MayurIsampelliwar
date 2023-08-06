package equals;

public class Driver1 {
	public static void main(String[] args) {
		E1 obj = new E1("MayUR");
		E1 obj1 = new E1("Mayur");
		System.out.println(obj == obj1);
		System.out.println(obj.equals(obj1));
	}

}
