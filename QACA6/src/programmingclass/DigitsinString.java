package programmingclass;

public class DigitsinString {
	public static void main(String[] args) {
		int digits = 0;
		String s = "12345jfuf";
		int sum = 0;
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]>='A' && ch[i]<='Z' ||ch[i]>='a' && ch[i]<='z'))
			{
				sum = sum + (ch[i]-48);
			}
		}
		System.out.println(sum);
		
	}
}
