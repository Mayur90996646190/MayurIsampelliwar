package programmingclass;

public class WordReverse {
	public static void main(String[] args) {
		String sent = "My name is Khan I m not a Terrorist";
		String[] s = sent.split(" ");
		String[] s1 = new String[s.length];
		int j=0;
		for (int i = s.length-1; i>=0; i--) {
		
			s1[j] = s[i];
			j++;
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}
}
