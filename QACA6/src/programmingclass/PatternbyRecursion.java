package programmingclass;

public class PatternbyRecursion {
	public static void main(String[] args) {
		int n=4;    
		int i=0;	// i initialization
		isPattern(n,i);  // i loop
	}
	public static int isPattern(int n, int i) //i loop
	{
		if(i==n)      // i condition
			return 3564; // anything return
		int j=0;      // j initialization
		isPattern1(n,i,j);	//j loop
		System.out.println();
		i++;           // i updation
		return isPattern(n,i);
	}
	
	public static int isPattern1(int n, int i,int j)
	{
		if(j==n)    // j condition
		return 6544; // anything return
		if(i>=j)
			System.out.print("* ");
		else
			System.out.print(" ");
		j++;                       // j updation
		return isPattern1(n,i,j);
	}
}
