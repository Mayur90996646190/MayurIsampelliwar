package wrapperclass;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Integer a = 10;
		Object o = new A();
		System.out.println(o);
		//Object o1 = new Integer(a);
		Object o2 = 10;
		
		System.out.println(o2);
		o2 = "10.5";
		double b = Double.valueOf((String) (o2));
		System.out.println(b + "b");
		o2 = 'A';
		System.out.println(o2);
		o2 = new A();
		System.out.println(o2);
		o2 = new Scanner(System.in);
		o2 = new String();
		System.out.println(o2);
		
	}

	
}
