
public class LinkedListCustomVersion {

	Node head;

	public static void main(String[] args) {
		LinkedListCustomVersion linkedlist = new LinkedListCustomVersion();
		linkedlist.add(3);
		linkedlist.add(13);
		linkedlist.add(23);
		linkedlist.add(34);
		linkedlist.printmylinkedlist();
	}

	// TODO Break condition
	public boolean isEmpty() {
		return (head == null);
	}

//TODO linked list add condition
	// Let's do recursive call to call the method itself and check
	// head
	public void add(int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	// To remove an element from a linked list
	public void remove() {

	}

	// To print the linkedlist
	public void printmylinkedlist() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}
}
