package exceptions1;

public class E3 {
	public static void dinga()
	{try {
		System.out.println("Dinga Begins");
		dingi();
		System.out.println("Dingi Ends");
	}
	catch(Exception e)
	{
		System.out.println("Exception is handled");
	}
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		dinga();
		System.out.println("Main End");
	}
	public static void dingi()
	{
		System.out.println("Dingi Begins");
		int a =10;
		int b = 0;
		System.out.println(a/b);
	
		System.out.println("Dingi Ends");
	}
}
