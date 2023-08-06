package arraylist;

import java.util.ArrayList;

public class PrimeNumber {
	
	public static void primeNumber(int m, int n)
	{	ArrayList ls = new ArrayList();
		int num=m;
		
		for(num=m; num<n;num++)
		{	int count =0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{	
				ls.add(num);
			}
		}
		System.out.println(ls);
	}
	public static void main(String[] args) {
		primeNumber(1,100);
	}
}
