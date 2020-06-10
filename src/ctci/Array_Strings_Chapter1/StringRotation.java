package ctci.Array_Strings_Chapter1;

//Assume that you have a method isSubstring which checks if one word is a substring of another
//Given two Strings s1 and s2 check if s2 is a rotation of s1 using only call to isSubstring

///example : "waterbottle" is a rotation of "erbottlewat"
public class StringRotation {

	public static void main(String[] args) {
		String s = "Pritam";

		System.out.println(s.substring(2, 4));
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		isSubstring(s1, s2);

	}

	static boolean isSubstring(String s1, String s2) {

		// so if we split s1 in
		// x = wat
		// y=erbottle
		// then s1=xy and similarly s2=yx
		// Regardless of where the division between x and y is we can see that
		// yx will always be a substring of xyxy.
		// s2 will always be a substring of s1s1(xyxy)
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}
		return false;
	}
}
