/**
 *
 */
package ctci.Chapter2_LinkedList;

/**
 * @author Pritam Chavhan
 *
 */
public class CustomLinkedList {

	Node head = null;
	Node tail = null;
	public static void main(String[] args) {

	}
	// Prints the LinkedList in the original order
	private void printLinkedList() {

		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		int size = lengthOfLinkedList();
		for (int i = 0; i < size; i++) {

			System.out.println("Printing Node = " + current.data);
		}
	}

	// Creates or adds element in the LinkedList
	private void addNode(int data) {

		// head

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;

		}

	}
	// gives the size of the LinkedList
	private int lengthOfLinkedList() {
		return 0;
	}

}
