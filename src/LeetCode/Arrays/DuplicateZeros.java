package LeetCode.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
	int[] arr = { 1, 2, 0 };

	duplicateZeros(arr);
    }

    private static void duplicateZeros(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] != 0) {
		duplicateZeros(arr);

	    } else {
		System.out.println("There is 0 present");
	    }
	}

    }

}
