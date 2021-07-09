// Explicit type conversion is also called Narrowing Casting
public class Narrowing {
	public static void main(String[] args) {
		double d = 200.06;

		// explicit type casting
		long l = (long)d;

		// explicit type casting
		int i = (int)l;
		System.out.println("Double Data type value " + d);

		// fractional part lost
		System.out.println("Long Data type value " + l);

		// factional part lost
		System.out.println("Int Data type vaue " + i);
	}
}