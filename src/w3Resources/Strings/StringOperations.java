package w3Resources.Strings;

import java.util.Calendar;

//Many ways to compare string
public class StringOperations {

	public static void main(String[] args) {

		String str = "Pritam is my FirstName  ";
		String str2 = "Chavhan is my LastName";
		compareString(str, str2);
	}

	private static void compareString(String str, String str2) {
		// str.toCharArray(); Second way to do is converting into CharArray
		System.out.println(" I am printing " + str.compareTo(str2));

		System.out.println("Ignoring Case difference " + str.compareToIgnoreCase(str2));
		System.out.println("Concating here " + str.concat(str2));
		System.out.println(" Checking contains return boolean " + str.contains("Hello"));
		StringBuffer br = new StringBuffer(str2);
		System.out.println(br);
		System.out.println(str2.contentEquals(br));
		char[] a = new char[] { '1', '2', '3', '4' };
		String string1 = String.copyValueOf(a, 0, 4);// Creates a string containing a char array
		System.out.println("this is string 1  " + string1);
		System.out.println("Checking if string endswith" + str.endsWith(string1));
		System.out.println(str.equals(str2));
		// Print current date and time
		Calendar c = Calendar.getInstance();
		System.out.println("Current Data and Time is " + c);
		System.out.format("%tB %tA %tY %tH %tM %tS %ts", c, c, c, c, c, c, c);
		str.regionMatches(0, string1, 0, 3);
		System.out.println();
		System.out.println("Replacing " + str.replace('P', 'd'));// replace all p with d
		System.out.println("Replacing All " + str.replace("is", "with"));// replace all p with d
		str.startsWith(str2);
		System.out.println("Substring " + str.substring(0, str.length() - 2)); // index starts from zero and from
		// backwards count from 1
		System.out.println("Converting string to lowercase " + str.toLowerCase());
		System.out.println("Striping leading or trailing whitespace front and rear space " + str.strip());

		boolean s4;
		System.out.println(s4 = str.charAt(1) == str2.charAt(1));

	}

}
