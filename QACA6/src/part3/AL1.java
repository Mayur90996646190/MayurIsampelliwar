package part3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Create an arrayList Object
 add int value
 add double value
 add character
 add boolean value
 add book object
 add Student Object
 add marker object
 add add scanner object
 */
class Book {
}

class Student {
}

class Marker {
}

public class AL1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Student s = new Student();
		Marker m = new Marker();
		Scanner sc = new Scanner(System.in);

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.0);
		al.add('A');
		al.add(true);
		al.add(b1);
		al.add(s);
		al.add(m);
		al.add(sc);
		System.out.println(al);
	}
}
