package w3Resources.Strings;

public class DivideStringInEqual {

    public static void main(String[] args) {
	String str = "abcdefghijklmnopqrstuvwxy";
	System.out.println(divideString(str));
	System.out.println(str.codePointCount(0, str.length()));
    }

    private static String divideString(String str) {

	char c[] = str.toCharArray();
	for (int i = 0; i < c.length % 10; i++) {
	}

	return str;
	// TODO Auto-generated method stub

    }

}
