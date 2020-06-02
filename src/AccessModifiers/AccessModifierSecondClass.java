package AccessModifiers;

public class AccessModifierSecondClass {
	public static void main(String[] args) {
		checkifPalindrome("abc");
		checkifPalindrome("aba");
		// Checking the access here
		PojoClassDefinitionsWithAccessModifiers pojo = new PojoClassDefinitionsWithAccessModifiers();

		pojo.Address = "Dearborn";
		pojo.lastName = "Chavhan";
		pojo.Zipcode = "48120";
		// pojo.name = "Pritam";// can be accessed if we create getters and
		// setter which are public and variable is private
		/*
		 * pojo.setName("prit"); pojo.getName();
		 */
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
