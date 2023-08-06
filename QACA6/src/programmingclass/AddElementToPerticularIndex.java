package programmingclass;

import java.util.Arrays;

public class AddElementToPerticularIndex {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60};
		int index = 2;
		int element =900;
		
		int[] b = new int[a.length+1];
		
		for (int i = 0; i < b.length; i++) {
			if(i<index)
			{
				b[i] = a[i];
			}
			else if(i == index)
			{
				b[i] = element ;
			}
			else
				b[i] = a[i-1];
			
		}
		//System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
