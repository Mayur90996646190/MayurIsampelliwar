package stringclass;

public class E9 {
	public static void main(String[] args) {
		try {
			A obj;
			obj = null;
			System.out.println(obj.hashCode());
		} catch (NullPointerException e) {
			System.out.println("NPE Caught...");
			String msg = e.getMessage();
			System.out.println("messege :" + msg);
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
