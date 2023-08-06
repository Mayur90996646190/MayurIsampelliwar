package programmingclass;

//to check String contains only digits or not
public class Str22 {
	public static void main(String[] args) {
		String s = "544644";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=0 && ch[i]<=9)
			{
				System.out.println("String contains all digits");
			}
			else
				System.out.println("String not contains all digits");
		}
		//int a = Integer.parseInt(s);
	}
}
