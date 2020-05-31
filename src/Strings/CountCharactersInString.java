package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharactersInString {

	public static void main(String[] args) {

		System.out.println(
				"Please enter the String for which you are looking to count the Characters");
		// input
		String br = "Pritam";
		System.out.println("Characters in the String " + br.length());

		br.toCharArray();
		List<String> list = Arrays.asList(br);
		Map<String, Integer> hashmap = new HashMap();
		hashmap.put(br, 1);
		System.out.println("hashmap" + hashmap);
	}

}
