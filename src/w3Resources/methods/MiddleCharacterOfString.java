package w3Resources.methods;

public class MiddleCharacterOfString {

    public static void main(String[] args) {
	// middle character of String

	String a = "prit";
	evenNoChar(a);
	String b = "pri";

	if (b.length() / 2 != 0) {
	    System.out.println((b.charAt(b.length() / 2)) + "" + b.charAt(b.length() / 2 + 1));
	}
    }

    private static void evenNoChar(String a) {
	System.out.println(a.charAt(a.length() / 2));
    }

}
