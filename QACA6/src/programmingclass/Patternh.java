package programmingclass;

public class Patternh {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i+j>=n-1)
				{	
					System.out.print(a++%2 +" ");
				}
				else
					System.out.print("  ");
			}
			for(int j=1; j<n; j++)
			{
				if(i>=j)
				{	
					System.out.print(a++%2 +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
