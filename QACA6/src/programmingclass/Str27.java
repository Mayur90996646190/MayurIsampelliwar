package programmingclass;

public class Str27 {
	public static void main(String[] args) {
		String s = "all the best";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ')
			{
				ch[i] = '#';
			}
		}
		String s1 = new String(ch);
		System.out.println(s1);
	}
}
