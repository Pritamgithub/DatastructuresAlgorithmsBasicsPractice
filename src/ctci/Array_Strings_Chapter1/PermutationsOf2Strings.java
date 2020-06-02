package ctci.Array_Strings_Chapter1;

import java.util.Arrays;

//Given two Strings write a method to decide if one is the permutation of the other
public class PermutationsOf2Strings {

	public static void main(String[] args) {

		String s1 = "Pritam";// here we can take input from the command line or
								// any Rest endpoint
		String s2 = "Chavhan";
		checkPermutation(s1, s2);
	}

	private static void checkPermutation(String s1, String s2) {

		/*
		 * break condition if length of the string is not equal then it's not a
		 * permutation // if string passed is empty then no permutation
		 */

		// 1. Sort both the strings and check if they are equal and if yes then
		// both of them are permutation of each other

		char c1[] = s1.toCharArray();
		Arrays.sort(c1); // Here we can use any sorting algorithms like Merge
							// sort, Bubble sort or quick sort
		char c2[] = s2.toCharArray();
		Arrays.sort(c2);

		// Now we can check if both the sorted arrays are same

		//

	}

}
