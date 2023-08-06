package programmingclass;

public class Str25 {
	public static void main(String[] args) {
		String s = "aaabbcdeefg";
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (b[i] == false) {
				for (int j = i + 1; j < b.length; j++) {
					if(ch[i]==ch[j])
					{
						count++;
						b[i] = true;
					}
				}
			}
			if (count == 1)
				System.out.println(ch[i] );
		}

	}
}
