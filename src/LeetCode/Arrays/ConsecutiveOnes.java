
package LeetCode.Arrays;

//Given a binary array, find the maximum number of consecutive 1s in the array
// Input [1,1,0,1,1,1]
//output :3
//hint last three digits are consecutive 1s that's why output is 3
public class ConsecutiveOnes {

    public static void main(String[] args) {
	int nums[] = { 1, 1, 0, 1, 1, 1 };

	countConsecutiveOnes(nums);
    }

    private static int countConsecutiveOnes(int[] nums) {
	int counter = 0;
	int maxCounter = 0;
	for (int i = 0; i < nums.length - 1; i++) {

	    if (nums[i] == 1) {
		counter++;// post increment
		/*
		 * // 1 // 2 // 3 // 4 // counter += 1;// 0+1=1 //counter=counter+1; // 1+1=2 //
		 * 2+1=3 // 3+1=4 // 4+1=5 // 5+1=6
		 */
	    } else {
		maxCounter = Math.max(maxCounter, counter);
		System.out.println(" Max counter value " + maxCounter);
		counter = 0;
		System.out.println(" counter value " + counter);
	    }

	}
	return maxCounter;

	// System.out.println("Length of an array " + counter);
	// System.out.println("Capacity of an array " + nums.length);

    }

}
