package part2;

public class Driver2 {
	public static void main(String[] args) {
		A obj = new B();// runtime present all members of
		B obj1 = (B) obj;
		System.out.println(obj1.i);
		System.out.println(obj1.j);
	}
}
