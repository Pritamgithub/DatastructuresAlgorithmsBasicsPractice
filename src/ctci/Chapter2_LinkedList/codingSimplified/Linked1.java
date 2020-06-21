package ctci.Chapter2_LinkedList.codingSimplified;

public class Linked1 {

	private Node getNewNode(int key) {

		Node a = new Node();
		a.data = key;
		a.next = null;
		return a;

	}

	public Node insert(Node node, int key) {

		if (node == null) {
			return getNewNode(key);
		} else
			node.next = insert(node.next, key);
		return node;

	}

}
