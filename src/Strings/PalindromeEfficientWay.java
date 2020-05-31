package Strings;

public class PalindromeEfficientWay {
	public static void main(String[] args) {
		checkifPalindrome("abc");
		checkifPalindrome("aba");

	}

	private static void checkifPalindrome(String input) {

		int length = input.length();
		boolean result = true;
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		System.out.println(result);

	}
}
