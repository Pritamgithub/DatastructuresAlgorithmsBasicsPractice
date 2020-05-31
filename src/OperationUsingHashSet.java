import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

public class OperationUsingHashSet {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Prit");
		list.add("Pritam");
		list.add("Prit");
		list.add("Prit");
		list.add("chavhan12");
		list.add("chavhan12");
		System.out.println("List is" + list);

		HashSet<String> hash = new HashSet(list);
		/*
		 * hash.add("Prit"); hash.add("Prit"); hash.add("Prit"); hash.add("Prit");
		 * hash.add("Prit"); hash.add("chavhan");
		 */

		System.out.println("Max is " + Collections.max(list));

		for (String s : hash) {
			System.out.println("Hash is " + s + " -" + Collections.frequency(list, s) + " times");
			try {

			} catch (RuntimeException e) {
				// TODO: handle exception
				System.out.println(Logger.getLogger(s));
			}
		}

	}

}
