package SortingUsingComparable_Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VendingMachinceComparator {

	// comparator allows custom sorting
	public static void main(String[] args) {

		List<VendingComparator> vendingList = new ArrayList<>();
		vendingList.add(new VendingComparator("Banana", 200, 10));
		vendingList.add(new VendingComparator("Apple", 100, 2));
		vendingList.add(new VendingComparator("Strawberry", 300, 5));
		System.out.println(vendingList);

		Comparator<VendingComparator> vendingcomp = new Comparator<VendingComparator>() {

			@Override
			public int compare(VendingComparator o1, VendingComparator o2) {
				if (o1.getPrice() > o2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(vendingList, vendingcomp);
		// System.out.println(vendingList);
		for (VendingComparator v : vendingList) {
			System.out.println(v);
		}

	}

}
