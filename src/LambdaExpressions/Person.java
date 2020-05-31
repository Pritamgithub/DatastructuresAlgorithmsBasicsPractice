package LambdaExpressions;

import lombok.Data;

@Data
public class Person {

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;

}
