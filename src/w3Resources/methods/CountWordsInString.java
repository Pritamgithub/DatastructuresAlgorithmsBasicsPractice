package w3Resources.methods;

import java.util.StringTokenizer;

public class CountWordsInString {
    public static void main(String[] args) {

	String S = "Pritam is Honest";
	System.out.println(countcharacters(S));
	System.out.println(countWordinString(S));
	System.out.println(usingSplitMethod(S));
	System.out.println(usingStringTokenizer(S));

    }

    private static int usingStringTokenizer(String s) {
	if (s == null || s.isEmpty()) {
	    return 0;
	}
	StringTokenizer tokens = new StringTokenizer(s);

	return tokens.countTokens();

    }

    private static int countcharacters(String s) {
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) != ' ') {
		count++;
	    }

	}
	return count;

    }

    private static int countWordinString(String s) {
	int count = 0;
	char ch[] = new char[s.length()];
	for (int i = 0; i < s.length(); i++) {
	    ch[i] = s.charAt(i);
	    if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
		count++;
	    }

	}
	return count;
    }

    private static int usingSplitMethod(String s) {
	int count = 0;
	String[] wordsString = s.split("\\s+");// \s is character class to detect space including tabs. since \needs
	// to be escaped it becomes \\s and because there could be multiple spaces
	// between words it's a regular expression
	// by adding +
	return wordsString.length;
    }

}
