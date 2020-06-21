package LeetCode.Arrays;

import java.util.Arrays;

//Input [-4,-1,0,3,10]
// Output [0,1,9,16,100]

//Input[-7,-3,2,3,11]
//Output[4,9,949,121]
public class SquaresofSortedArrray {
    static int A[] = { -4, -1, 0, 3, 10 };

    public static void main(String[] args) {

	System.out.println(Arrays.toString(sortedSquares(A)));

    }

    static int[] square = new int[A.length];

    private static int[] sortedSquares(int[] A) {
	for (int i = 0; i < A.length; i++) {
	    square[i] = A[i] * A[i];
	}
	Arrays.sort(square);
	return square;

    }

}
