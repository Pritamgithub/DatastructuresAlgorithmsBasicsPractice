package LambdaExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CollectorsExamplefromPerson {

	public static void main(String[] args) throws IOException {

		List<Person> persons = new ArrayList<Person>();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(CollectorsExamplefromPerson.class
						.getResourceAsStream("people.txt")));
				Stream<String> stream = br.lines();) {

			stream.map(line -> {
				String s[] = line.split(" ");
				Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);

		}

		Stream<Person> stream = persons.stream();

		Optional<Person> opt = stream.filter(p -> p.getAge() > 20)
				.min(Comparator.comparing(Person::getAge));
		System.out.println(opt);

		Stream<Person> stream1 = persons.stream();

		Optional<Person> opt2 = stream1.filter(p -> p.getAge() > 20)
				.max(Comparator.comparing(Person::getAge));
		System.out.println(opt2);

	}

}
