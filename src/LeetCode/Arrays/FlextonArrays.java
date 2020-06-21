package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
     * * Given an array of integers, return a list of integers which contains [1st
     * integer, Sum of next 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th,
     * 6th)…] and so on
     *
     * Input [1,6,8,5,9,4,7,2] Output [1,14,18,9]
     *
     *
     */

class FlextonArrays {

    public static void main(String[] args) {
	System.out.println(summation(new int[] { 1, 6, 8, 5, 9, 4, 7, 2 }));
    }

    private static List<Integer> summation(int[] arr) {

	List<Integer> result = new ArrayList<>();

	int limit = 1;
	int start = 0;
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (start == limit) {
		result.add(sum);
		sum = 0;
		limit++;
		start = 0;
	    }
	    sum += arr[i];
	    start++;
	} // end of loop

	if (sum > 0)
	    result.add(sum);

	return result;
    }
}
