package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 3);

		List<Integer> result = new ArrayList();

		Consumer<Integer> c1 = System.out::print;
		// System.out.println();
		// list.forEach(c1);

		Consumer<Integer> c2 = result::add;
		list.forEach(c1.andThen(c2));

		System.out.println(result);
	}

}
