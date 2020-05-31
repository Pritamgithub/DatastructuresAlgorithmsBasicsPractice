public class PalindromeString {

	public static void main(String[] args) {

		/*
		 * First way to do
		 *
		 *
		 * StringBuilder sb = new StringBuilder(S); sb.reverse();
		 * System.out.println(sb);
		 */

		/*
		 * Second way to do
		 *
		 * char[] a = S.toCharArray(); for (int i = a.length - 1; i > -1; i--) {
		 *
		 * System.out.print(a[i]); }
		 */

		/*
		 * Third way using String Buffer
		 *
		 *
		 * StringBuffer sbf = new StringBuffer(S); sbf.reverse(); System.out.println(sbf
		 * + " Output using String Buffer");
		 */

		/*
		 * 4rth way
		 *
		 * char[] a = S.toCharArray(); List<char[]> list = Arrays.asList(a); for (char[]
		 * i : list) { System.out.println(i); }
		 */

		String str = "aba";

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
//		If a String is Palindrome or not

	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

}
