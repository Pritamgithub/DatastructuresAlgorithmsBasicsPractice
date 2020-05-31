import java.util.stream.IntStream;

//Problem statement
//WAP that prints numbers from 1to 100 and for the multiple of 3 print fizz and for the 5 print buzz

public class Fizzbuzz {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			if (i % 15 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}

		}

		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "Fizzbuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
	}

}
