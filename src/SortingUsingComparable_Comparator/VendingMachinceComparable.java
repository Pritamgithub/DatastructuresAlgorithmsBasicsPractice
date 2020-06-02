package SortingUsingComparable_Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachinceComparable {

	public static void main(String[] args) {

		List<VendingComparable> vendingList = new ArrayList<>();
		vendingList.add(new VendingComparable("Banana", 200, 10));
		vendingList.add(new VendingComparable("Apple", 100, 2));
		vendingList.add(new VendingComparable("Strawberry", 300, 5));

		System.out.println(vendingList);

		Collections.sort(vendingList);
		// System.out.println(vendingList);
		for (VendingComparable v : vendingList) {
			System.out.println(v);
		}

	}

}
