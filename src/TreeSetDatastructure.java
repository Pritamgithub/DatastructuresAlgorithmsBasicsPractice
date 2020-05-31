import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDatastructure {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList();
		list.add(100);
		list.add(2);
		list.add(100);
		list.add(300);
		TreeSet<Integer> tree = new TreeSet(list);// preserves the order
		System.out.println(tree);

		HashSet<String> hs = new HashSet(list);
		System.out.println(hs);

		Set<String> newlist = new HashSet(list);
		newlist.add("Pritam");
		newlist.add("Pritam");
		newlist.add("Pritam");
		newlist.add("Pritam");
		newlist.add("Pritam");
		System.out.println("newlist is coming out" + newlist);
	}
}
