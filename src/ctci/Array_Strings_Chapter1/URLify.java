package ctci.Array_Strings_Chapter1;

//Input: "Mr John Smith   ", 13=== is nothing but the length of the string
//Output: "Mr%20John%20Smith"

//WAJP ti replace all the space with %20
public class URLify {

	public static void main(String[] args) {

		String s1 = "Mr John Smith   ";
		// take a method that takes the input
		/*
		 * s1 = s1.trim(); s1 = s1.replaceAll(" ", "%20");// need to assign it
		 * to new // variable // since Strings are immutable
		 * System.out.println(s1);
		 */
		/*
		 * char ch = 'M'; int ascii = ch; System.out.println(ascii); // this
		 * will print the ascii value of the // character
		 */
		urlfy(s1);
	}

	private static void urlfy(String s1) {

		// count the number of spaces.
		//

		System.out.println(
				"Number of spaces in the string are " + numberofspace(s1));
		int index1 = s1.length() + 5 * 2; // By tripling this number we can
											// count
											// how many extra spaces we will
											// have in the final string

		System.out.println(index1 + "Index value is");

		int index2 = index1 - 1;
		// char[] new_str = s;
	}

	private static int numberofspace(String s1) {
		char[] s = s1.toCharArray();
		// System.out.println(s[s1.charAt(1)]);
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s[i] == ' ') {
				count++;
			}

		}
		return count;
	}

}
