package AccessModifiers2;
import AccessModifiers.PojoClassDefinitionsWithAccessModifiers;

public class PojoTestFromdiffPackage {

	public static void main(String[] args) {
		PojoClassDefinitionsWithAccessModifiers pj = new PojoClassDefinitionsWithAccessModifiers();
		pj.lastName = "Chavhan";
		// pj.name = "Prit"; name is private

	}

}
