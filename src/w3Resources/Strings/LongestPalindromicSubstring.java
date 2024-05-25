package w3Resources.Strings;

//find the longest palindromicsubstring within a string
//Problem 32 of w3 resources
public class LongestPalindromicSubstring {

    public static void main(String[] args) {

	String s1 = "aba";
	System.out.println(s1.charAt(0) == s1.charAt(2));// way to check the values
	LongestPalindromicSubstring longest = new LongestPalindromicSubstring();
	longest.longestPalindrome(s1);
	longest.expandFromMiddle(s1, 0, s1.length());

    }

    public String longestPalindrome(String s) {
	if (s == null || s.length() < 1)
	    return "";
	int start = 0;
	int end = 0;
	for (int i = 0; i < s.length(); i++) {
	    int len1 = expandFromMiddle(s, i, i);
	    int len2 = expandFromMiddle(s, i, i + 1);
	    int len = Math.max(len1, len2);
	    if (len > end - start) {
		start = i - ((len - 1) / 2);
		end = i + (len / 2);
	    }

	}

	return s.substring(start, end + 1);

    }

    // aba
    public int expandFromMiddle(String s, int left, int right) {
	if (s == null || left > right)
	    return 0;
	while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	    left--;
	    right++;
	}
	return right - left - 1;

    }

}
