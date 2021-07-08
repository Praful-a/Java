public class StaticMethod {
	static int j = 100;
	int n = 200;

	static void a() {
		a = 200;
		System.out.println("Print from a");

		// Cannot make a static reference to the non-static
		n = 100; // compilation error

		// Cannot make a static reference to the non-static
		// method a2() from the type Test
		a2(); // compilation error

		// Cannot use super in a static context
		System.out.println(super.j); // compilation error
	}
	// instance method
	void a2() {
		System.out.println("Inside a2");
	}
	public static void main(String[] args) {
		// main method
	}
}