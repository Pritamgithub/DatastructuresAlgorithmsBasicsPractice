package LambdaExpressions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparatorLambda {

	public static void main(String[] args) {

		/*
		 * Comparator<String> comp = new Comparator<String>() {
		 *
		 * @Override public int compare(String o1, String o2) { return
		 * Integer.compare(o1.length(), o2.length()); } };
		 */

		Comparator<String> compLambda = (o1, o2) -> Integer.compare(o1.length(),
				o2.length());

		List<String> list = Arrays.asList("pritam", "chavhan", "prakash",
				"apple");

		Collections.sort(list, compLambda);

		for (String s : list) {
			System.out.println(s);
		}
	}

}
