package programmingclass;

public class P2 {
	public static void main(String[] args) {
		int n=4;
		char ch ='A';
		int k = 1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i+j>=n-1)
				{
					if(i%2==0)
					{
						System.out.print(k++ + " ");
					}
					else
						System.out.print(ch++ + " ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
