package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordsInString {

	// Similar to count Characters in String
	public static void main(String[] args) {

		String S = "Input String from code from java code";// can be taken from
															// CommandLine or
		// file
		numberofoccurenceofWord(S);
	}

	private static void numberofoccurenceofWord(String S) {

		Map<String, Integer> map = new HashMap();
		// char[] ch = S.toCharArray();

		// Split the words with white space
		String[] words = S.split(" ");
		for (String word : words) {
			if (map.containsKey(word)) {

				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(" I am coming from original way of printing" + map);
		// Using entry or Keyset for viewing the collection in different formats

		System.out.println("Printing using EntrySet it also gives the count");
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> s : set) {
			System.out.println(s/* s.getKey() + " " + s.getValue() */);
		}

		System.out.println("Printing using KeySet");
		Set<String> setk = map.keySet();
		for (String s : setk) {

			System.out.print(s);
		}
	}

}
