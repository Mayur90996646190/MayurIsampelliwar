package RevisionClass;

public class NeonNo {
	public static void main(String[] args) {
	int num = 9;
	int temp = num;
	int sq = num*num;
	int sum = 0;
	while(sq>0)
	{
		int rem = sq%10;
		sum = sum+rem;
		sq=sq/10;
	}
	if(sum == temp)
		System.out.println(num + " is a Neon number");
	else
		System.out.println(num + " is not a Neon number");
	}
}
