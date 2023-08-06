package exceptions;

public class E1 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		try
		{
			int a = 10;
			int b = 2;
			System.out.println(a/b);
		}
		catch(RuntimeException e)
		{
			System.out.println("Exception handle");
		}
		System.out.println("Main End");
	}
}
