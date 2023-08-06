package equals;

public class FinalMethod {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}

	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		new FinalMethod();
		new FinalMethod();
		System.gc();
		System.out.println("Hi");
		// System.out.println(f.getClass());
	}
}
