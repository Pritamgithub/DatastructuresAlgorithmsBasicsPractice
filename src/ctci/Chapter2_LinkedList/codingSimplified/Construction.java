package ctci.Chapter2_LinkedList.codingSimplified;

public class Construction {

	public static void main(String[] args) {

		Shirt s = new Shirt("white", "Large");
		System.out.println(s.name + s.size);

		System.out.println("coming from getters" + s.getName() + s.getSize());

		/*
		 * Shirt s = Shirt.singletonObj; System.out.println();
		 */
	}
}
