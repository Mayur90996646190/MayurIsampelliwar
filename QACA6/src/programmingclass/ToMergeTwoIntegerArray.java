package programmingclass;

public class ToMergeTwoIntegerArray {
	public static void main(String[] args) {
		int[] a = {10,20,50,60};
		int[] b = {15,60,48,69};
		int size = a.length + b.length;
		int[] c = new int[size];
		System.out.println(c.length);
		
		for(int i=0; i<a.length;i++)
		{
			c[i] = a[i];
			
		}
		for(int i=0; i<b.length;i++)
		{
			c[a.length+i] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
