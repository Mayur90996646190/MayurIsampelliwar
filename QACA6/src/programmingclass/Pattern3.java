package programmingclass;

public class Pattern3 {
	public static void main(String[] args) {
		int n=7;
		int sp =n-1;
		int star =1;
		char ch = 'a';
		char k = 'p';
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<sp; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print(ch++ + " ");
			}
			
			if(i<n/2)
			{
				star+=2;
				sp--;
			}
			else
			{
				star-=2;
				sp++;
				if(ch==k)
				{
					ch='a';
				}
			}
			System.out.println();
		}
	}
}
