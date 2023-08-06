package stringclass;

class Driver1 {
	public static void main(String[] args) {
		String1 s1 = new String1("Sheela");
		System.out.println(s1);
		System.out.println(s1.getName());

		s1 = s1.setName("Hello");
		System.out.println(s1);
		System.out.println(s1.getName());

		s1 = s1.setName("Hello");
		System.out.println(s1);
		System.out.println(s1.getName());

	}

}
