package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInString {

	public static void main(String[] args) {

		System.out.println(
				"Please enter the String for which you are looking to count the Characters");
		// input Can be taken with the help of BufferedReader or Scanner here in
		// case Instead of mentioning the String value
		String br = "InputString";
		System.out.println("Number of Characters in the String " + br.length());

		char[] c = br.toCharArray();

		Map<Character, Integer> hashmap = new HashMap();
		for (Character ch : c) {
			if (hashmap.containsKey(ch)) {
				hashmap.put(ch, hashmap.get(ch) + 1);
			} else {
				hashmap.put(ch, 1);
			}
		}

		System.out.println(hashmap);
	}

}
