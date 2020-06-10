package ctci.Chapter2_LinkedList;

import lombok.Data;

@Data
public class Node {

	int data;
	Node next;
	/**
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.next = next;
	}

}
