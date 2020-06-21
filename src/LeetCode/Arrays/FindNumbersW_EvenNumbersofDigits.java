package LeetCode.Arrays;

//Given an array nums of integers, return how many of them contain an even number of digits
//input array as stated below
//output = 1 (since 7000 = 4 digits means even)
public class FindNumbersW_EvenNumbersofDigits {

    public static void main(String[] args) {
	int nums[] = { 2, 5, 100, 4, 7000, 5 };

	System.out.println(findEvenNumbersOfDigits(nums));
	traditionalAndEnhancedForLoop(nums);
    }

    private static int findEvenNumbersOfDigits(int[] nums) {
	int evenCounter = 0;

	/*
	 * for (int i = 0; i < nums.length - 1; i++) { while (nums[i] != 0) { nums[i] =
	 * nums[i] / 10; ++evenCounter; if(evenCounter==2) {
	 *
	 * } }
	 *
	 * }
	 */
	for (int i = 0; i < nums.length; i++) {
	    if (String.valueOf(nums[i]).length() % 2 == 0) {
		evenCounter++;
	    }
	}

	/*
	 * for (int i : nums) { if (String.valueOf(i).length() % 2 == 0) {
	 * evenCounter++; }
	 */
	return evenCounter;
    }

    private static void traditionalAndEnhancedForLoop(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	    System.out.println(" I am from regular for loop " + nums[i]);
	}
	for (int i : nums) {
	    System.out.println("I am coming from enhanced" + i);
	}
    }
}
