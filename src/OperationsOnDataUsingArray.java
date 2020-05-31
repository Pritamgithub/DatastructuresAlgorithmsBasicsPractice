import java.util.Arrays;

public class OperationsOnDataUsingArray {

	// On a datastrucure we can perform searching, sorting, insertion,deletion

//insert an element in an array or list

	public static void main(String args[]) {

		int[] a = new int[4];
		int[] b = { 1, 2, 3, 4 };
		a[0] = 1;
		a[1] = 2;
		b[2] = 5;
		Arrays.asList(a);
		System.out.println("Printing i here from as list");
		for (Integer i : a) {
			System.out.println(i);
		}
		System.out.println("Array b before inseting");
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}
		System.out.println("Printing using lambda expressions");
		for (Integer i : b) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Array b after inseting");
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}

	}

}
