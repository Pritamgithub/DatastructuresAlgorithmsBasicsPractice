import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDataStrucutre {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Pritam");
		list.add("Chavhan");
		list.add("Prakash");

		Collections.sort(list);
		// System.out.println(list);

		Collections.replaceAll(list, "Pritam", "Prit");
		// System.out.println(list);

		Collections.shuffle(list);

		LinkedList<String> listlinked = new LinkedList();
		listlinked.add("C");
		listlinked.add("C++");
		listlinked.addFirst("Java");
		listlinked.addLast("Oracle");
		listlinked.add("PHP");
		// System.out.println("Before index1" + listlinked);
		listlinked.add(1, "AJAX");
		// System.out.println("After adding index 1 " + listlinked);

		listlinked.remove("PHP");
		/*
		 * System.out.println("Before removing position 2" + listlinked);
		 * System.out.println("AT Index 0 I am here ->>" + listlinked.get(0));
		 */
		listlinked.remove(2);
		// System.out.println("after removing postion 2" + listlinked);

		// System.out.println("" + listlinked);
		listlinked.removeFirst();
		listlinked.removeLast();

		Iterator<String> itr = list.iterator();
		Iterator itrLinkedList = listlinked.descendingIterator();

		while (itr.hasNext()) {
			System.out.println("Hi " + itr.next());
		}
		// System.out.println("contents of linked list" + listlinked);

	}

}
