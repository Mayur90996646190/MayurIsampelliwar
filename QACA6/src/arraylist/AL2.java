package arraylist;

import java.util.ArrayList;

public class AL2 {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				ls.add(i);
			}
			
		}
		System.out.println(ls);
	}
}
