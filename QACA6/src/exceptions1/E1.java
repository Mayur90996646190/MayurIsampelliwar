package exceptions1;

public class E1 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		int a = 10;
		int b = 0;
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception h)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Main Begin");
	}
}
