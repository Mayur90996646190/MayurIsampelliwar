package programmingclass;

public class ArrayMerge {
	public static void main(String[] args) {
		int[] a = {10,20,365,464};
		int[] b = {52,65,8,4,55};
		int[] res = merge(a,b);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	public static int[] merge(int[] a, int[] b)
	{	int size = a.length + b.length;
		int[] res = new int[size];
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i] = b[i];
		}
		return res;
	}
}
