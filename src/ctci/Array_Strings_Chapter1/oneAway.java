package ctci.Array_Strings_Chapter1;

//Three types of edits that can be performed on strings: insert a character, remove a character, replace a character.
//given 2 strings write a function to check if they are one eidt or zero edits away
// pale, ple-> true
//pales, pale->true
//pale, bale->true
//pale, bae-> false
public class oneAway {

	public static void main(String[] args) {

	}

	private boolean oneAwayFunction(String first, String second) {
		if (first.length() == second.length()) {
			// one replace way
			return oneReplaceAway(first, second);
		} else if (first.length() + 1 == second.length()) {
			// one add away
			return oneAddAway(first, second);
		} else if (first.length() - 1 == second.length()) {
			// one remove away
			return oneRemoveAway(first, second);
		}
		return false;

	}

	private boolean oneRemoveAway(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean oneAddAway(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean oneReplaceAway(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

}
