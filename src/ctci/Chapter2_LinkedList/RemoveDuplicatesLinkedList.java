/**
 *
 */
package ctci.Chapter2_LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Pritam Chavhan
 *
 */
public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {

		// First Approach -Talk to interviewer if he/she wants the solution like
		// this.

		removeDuplicateUsingCollections();

		// In order to remove duplicates we must see the duplicates
		// HashTable can be helpful

	}

	/**
	 * remove Duplicates using Collections
	 */
	private static void removeDuplicateUsingCollections() {
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("Collabera");
		linkedList.add("Infosys");
		linkedList.add("Collabera");
		linkedList.add("Infosys");
		linkedList.add("Collabera");
		linkedList.add("Infosys");
		linkedList.add("Amazon");

		System.out.println("Data in the LinkedList is " + linkedList);

		HashSet<String> hashSet = new HashSet();
		hashSet.addAll(linkedList);
		System.out.println("After removing Duplicates :-");
		System.out.println("Data in the HashSet is " + hashSet);
	}

	private void deleteDuplicates(LinkedList n) {
		// iterate through linkedList and add each element to hashtable
		// when we find duplicate element, remove element and continue

	}

}
