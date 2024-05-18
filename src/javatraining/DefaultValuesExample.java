package javatraining;

public class DefaultValuesExample {
	// Instance variables with default values

	// primitives
	byte byteValue;
	short shortValue;
	int intValue;
	long longValue;
	float floatValue;
	double doubleValue;
	char charValue;
	boolean boolValue;

	// non-primitive
	String strValue;

	public static void main(String[] args) {

		DefaultValuesExample obj = new DefaultValuesExample();

		// Default values of Primitive variables
		System.out.println("byteValue: " + obj.byteValue);
		System.out.println("shortValue: " + obj.shortValue);
		System.out.println("intValue: " + obj.intValue);
		System.out.println("longValue: " + obj.longValue);
		System.out.println("floatValue: " + obj.floatValue);
		System.out.println("doubleValue: " + obj.doubleValue);
		System.out.println("charValue: " + obj.charValue);
		System.out.println("boolValue: " + obj.boolValue);

		// Default values of Non-primitive variable
		System.out.println("strValue: " + obj.strValue);

		System.out.println(Person.companyName);

	}
}
