package programmingclass;

public class Pattern10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++)
		{	int a=1;
			for(int j=0; j<n; j++)
			{
				if(i+j<=n-1)
				{
					System.out.print(a++%2 + " ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
