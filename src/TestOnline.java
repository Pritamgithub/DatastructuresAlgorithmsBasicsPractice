import java.util.Arrays;
import java.util.OptionalInt;

public class TestOnline {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };

		OptionalInt sum = Arrays.stream(numbers).max();
		System.out.println("sum is " + sum);

		int lengt = numbers.length;

		System.out.println(lengt);

	}

}
