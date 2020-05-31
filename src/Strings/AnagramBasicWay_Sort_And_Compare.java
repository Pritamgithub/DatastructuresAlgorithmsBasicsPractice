/**
 *
 */
package Strings;

import java.util.Arrays;

/**
 * @author Pritam Chavhan
 *
 *         Check whether two Strings are Anagram or Not. Anagram means when
 *         String is giving when we shuffle the characters for example abcd then
 *         it becomes dabc
 */
public class AnagramBasicWay_Sort_And_Compare {
	public static void main(String[] args) {
		// Method 1.
		// Sort both the strings
		// compare the sorted Strings
		String s1 = "Listen";
		String s2 = "Triangle";
		checkAnagram(s1, s2);
	}
	private static void checkAnagram(String s1, String s2) {
		char s3[] = s1.toCharArray();
		char s4[] = s2.toCharArray();
		Arrays.sort(s3);
		System.out.println(s3);
		Arrays.sort(s4);
		System.out.println(s4);
		// compare two strings
		if (Arrays.equals(s3, s4)) {
			System.out.println("Both the strings are Anagrams");
		} else
			System.out.println("Both the strings are NOT Anagrams");

	}

}
