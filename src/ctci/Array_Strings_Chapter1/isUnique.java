package ctci.Array_Strings_Chapter1;

//Implement an algorithm to determine if the string has all unique characters.Without Using DS
public class isUnique {

	public static void main(String[] args) {

		String s1;
		isUniqueString(s1 = "preety");

	}

	private static void isUniqueString(String string) {

		// break condition
		if (string.length() != 0) {
			char chararray[] = string.toCharArray();
			char s2 = string.charAt(0);

			for (int i = 0; i < chararray.length; i++) {
				if (s2 != chararray[i + 1]) {
				} else
					System.out.println("String characters are not unique");
			}

		} else
			System.out.println("String is empty");

	}
}
