package programmingclass;
//Reverse the sSTring
public class Str29 {
	public static void main(String[] args) {
		String s = "one two three";
		String[] spl = s.split(" ");
		String temp = "";
		for(int i=spl.length-1; i>=0; i--)
		{
			temp = temp+spl[i];
		}
		//String s1 = new String(spl);
		//Note Can't do this above statement
		System.out.println(temp);
	}
}
