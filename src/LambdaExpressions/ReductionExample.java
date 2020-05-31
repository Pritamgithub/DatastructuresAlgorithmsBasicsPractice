package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 10, 11);

		Integer red = list.stream().reduce(0, (i1, i2) -> i1 + i2);

		System.out.println("red" + red);

		Optional<Integer> red1 = list.stream().reduce(Integer::max);
		System.out.println("red1" + red);
	}

}
