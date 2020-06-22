package w3Resources.methods;

public class SumOfDigits {
    public static void main(String[] args) {

	int digit;
	System.out.println(sumofDigits(digit = 12));

    }

    private static int sumofDigits(int i) {
	int sum = 0;

	while (i > 0) {
	    sum = sum + i % 10;
	    i = i / 10;
	}

	return sum;
    }

}
