package programmingclass;
//wjp to validate a password

//a)8-15 characters
//b)it should contains atleast one Uppercase
//c)it should contains atleast one lowercase
//d)It  should not have spaces 
//e)It should have Special character $#@!

public class Str19 {
	public static void main(String[] args) {
		String pass = "Mayur@90966";
		char[] pass1 = pass.toCharArray();
		boolean valid = false;

		if (pass.length() >= 8 && pass.length() <= 15) {
			for (int i = 0; i < pass1.length; i++) {
				if (pass1[i] > 'A' && pass1[i] < 'Z' || pass1[i] > 'a' && pass1[i] < 'z') {
					if (pass1[i] != ' ') {
						if (pass1[i] == '&' || pass1[i] == '#' || pass1[i] == '@' || pass1[i] == '#') {
							valid = true;
						}
					}
				}
			}
		}
		System.out.println(valid);

	}
}
