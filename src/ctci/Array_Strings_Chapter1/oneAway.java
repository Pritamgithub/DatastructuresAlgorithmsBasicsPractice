package ctci.Array_Strings_Chapter1;

//Three types of edits that can be performed on strings: insert a character, remove a character, replace a character.
//given 2 strings write a function to check if they are one edits or zero edits away
// pale, ple-> true
//pales, pale->true
//pale, bale->true
//pale, bae-> false
public class oneAway {

	public static void main(String[] args) {

		oneAway one = new oneAway();
		System.out.println(one.oneAwayFunction("av", "abc"));
		System.out.println(one.oneEditAway("av", "abc"));
	}

	private boolean oneAwayFunction(String first, String second) {
		if (first.length() == second.length()) {
			// one replace way
			return oneEditAway(first, second);
		} else if (first.length() + 1 == second.length()) {
			// one add away
			return oneEditAway(first, second);
		} else if (first.length() - 1 == second.length()) {
			// one remove away
			return oneRemoveAway(first, second);
		}
		return false;

	}
	// this handles replace and insert in the same method
	private boolean oneEditAway(String s1, String s2) {

		if (s1 == null || s2 == null || s1.length() - s2.length() == 0) {
			return false;
		}
		String str1 = s1.length() < s2.length() ? s1 : s2;
		String str2 = s2.length() < s1.length() ? s2 : s1;
		// TODO
		assert (str1.length() <= str2.length());

		int index1 = 0;// counter 1
		int index2 = 0;// counter 2
		char c1[] = str1.toCharArray(); // convert string 1 in char array
		char c2[] = str2.toCharArray();// convert string 2 in char array
		boolean foundDiff = false;

		while (index1 < s1.length() && index2 < s2.length()) {
			if (c1[index1] != c2[index2]) {
				if (foundDiff) {
					return false;
				}
				foundDiff = true;
				if (c1.length == c2.length) {
					index1++;
				}
			} else {
				index1++;

			}
			index2++;
		}
		return true;
	}

	private boolean oneRemoveAway(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

}
