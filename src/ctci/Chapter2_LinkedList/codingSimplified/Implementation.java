package ctci.Chapter2_LinkedList.codingSimplified;

public class Implementation {
	public static void main(String[] args) {

		Node root = null;
		Linked1 a = new Linked1();
		root = a.insert(root, 12);
		root = a.insert(root, 22);

		String s = "welcometojava";
		System.out.println("HI");
		String output = s.substring(0, 1).toUpperCase() + s;

		System.out.println("I am substring of  " + s.substring(1, 4));
	}

	// head=a.insert(root,12);

}
