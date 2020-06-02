package SortingUsingComparable_Comparator;
import lombok.Data;

@Data
public class VendingComparator {
	// When your Class doesn't use any Comparable Interface we can use our own
	// custom way of sorting using Comparator
	private String NameofProduct;

	private int price;

	private int quantity;

	public VendingComparator(String nameofProduct, int price, int quantity) {
		super();
		NameofProduct = nameofProduct;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Used along with Comparable interface
	 * 
	 * @Override public int compareTo(Vending2 vend2) {
	 *
	 * if (this.price >= vend2.price) { return 1; } else return -1;
	 *
	 * }
	 */
}
