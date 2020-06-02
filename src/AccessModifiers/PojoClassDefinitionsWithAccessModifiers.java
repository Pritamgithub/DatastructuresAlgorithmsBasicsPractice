package AccessModifiers;

public class PojoClassDefinitionsWithAccessModifiers {

	private String name;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String lastName;
	protected String Address;

	String Zipcode;

	private void method() {

		name = "Prajeet";
		lastName = "Chavhan";
		Address = "Nashik";
		Zipcode = "421202";

	}
}
