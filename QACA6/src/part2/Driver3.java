package part2;

public class Driver3 {

	public static void main(String[] args) {
		Book b = Book.addBook(101, "manual testing", "suhas sir");
		System.out.println(b);
		System.out.println(b.bid);
		System.out.println(b.title);
		System.out.println(b.author);
	}
}
