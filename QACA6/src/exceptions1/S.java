package exceptions1;

public class S {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		for(int i=0; i<=10000; i++)
		{
			sb.append("is awesome");
		}
		long start1 = System.currentTimeMillis();
		long end1 = System.currentTimeMillis();
		System.out.println("time taken by stringbuffer id" + end1);
		System.out.println("time taken by stringbuffer id" + start1);
	}
}
