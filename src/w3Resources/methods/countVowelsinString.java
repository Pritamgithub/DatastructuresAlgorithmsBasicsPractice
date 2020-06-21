package w3Resources.methods;

public class countVowelsinString {
    public static void main(String[] args) {

	String s = "pritam";
	// output = 4 aeiou
	// eoue
	System.out.println(countVowelsUsingCharArray(s));
	System.out.println(countVowelsUsingCharAt(s));

    }

    private static int countVowelsUsingCharAt(String s) {
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
		    || s.charAt(i) == 'u') {
		count++;
	    }

	}
	return count;
    }

    private static int countVowelsUsingCharArray(String s) {
	int count = 0;
	char[] strchar = s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
	    if (strchar[i] == 'a' || strchar[i] == 'e' || strchar[i] == 'i' || strchar[i] == 'o' || strchar[i] == 'u') {
		count++;
	    }

	}
	return count;
    }
}
