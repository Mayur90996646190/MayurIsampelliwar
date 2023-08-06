package programmingclass;
// print word by word
public class Str28 {
	public static void main(String[] args) {
		String a = "all the best";
		String[] s = a.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
