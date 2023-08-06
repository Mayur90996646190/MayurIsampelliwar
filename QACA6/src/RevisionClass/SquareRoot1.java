package RevisionClass;

import java.util.Iterator;

public class SquareRoot1 {
	public static void main(String[] args) {
		int num = 1000;
		int num1 = 0;
		for(int i =1 ; i <50; i++) {
			num1 = i*i;
			if(num1>1000)
				break;
			else if(i*i==num1)
				{
					System.out.println(num1);
				}
		}
	}
}
