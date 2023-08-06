package programmingclass;

public class ArmStrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int temp1 = num;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		int sum =0;
		
		while(temp>0)	
		{	int res = 1;
			int rem = temp%10;
			int count1 = count;
			while(count1>0)
			{
				 res = res * rem;
				count1--;
			}
			sum = sum + res;
			temp=temp/10;
		}
		if(sum==temp1)
		{
			System.out.println(temp1 + " is a armstrong number");
		}
		else
			System.out.println("is not a armstrong number");
	}
}
