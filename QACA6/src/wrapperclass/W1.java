package wrapperclass;

public class W1 {
	public static void print(char ch)
	{
		System.out.println("from Char");
	}
	public static void print(Character ch)
	{
		System.out.println("From character");
	}
	public static void main(String[] args) {
		print(Character.valueOf('A'));
		print('A');
	}
}
