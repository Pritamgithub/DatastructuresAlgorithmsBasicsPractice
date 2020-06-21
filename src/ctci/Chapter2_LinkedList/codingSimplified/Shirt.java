package ctci.Chapter2_LinkedList.codingSimplified;

public class Shirt {

	public String size;
	public String name;

	Shirt() {
	}

	Shirt(String size, String name) {
		this.size = size;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getSize() {
		return this.size;
	}

	/*
	 * // 1. to make a static variable static Shirt singletonObj = new Shirt();
	 * // 2. create a private constructor private Shirt() { } public static
	 * Shirt getInstance() { return singletonObj;
	 *
	 * }
	 *
	 * Shirt(String size, String name) { this.size = size; this.name = name; }
	 *
	 * public String getName() { return this.name; }
	 *
	 * public String getSize() { return this.size; }
	 *
	 * }
	 *
	 */

}
