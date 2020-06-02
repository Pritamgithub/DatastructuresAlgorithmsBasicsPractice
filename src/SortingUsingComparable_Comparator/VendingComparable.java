package SortingUsingComparable_Comparator;
import lombok.Data;

@Data
public class VendingComparable implements Comparable<VendingComparable> {

	private String NameofProduct;

	private int price;

	private int quantity;

	public VendingComparable(String nameofProduct, int price, int quantity) {
		super();
		NameofProduct = nameofProduct;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(VendingComparable vend2) {

		if (this.price >= vend2.price) {
			return 1;
		} else
			return -1;

	}

}
