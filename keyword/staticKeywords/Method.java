public class Method {
	// static variable
	static int j = 100;

	// instance variable
	int n = 200;

	// static method
	static void a() {
		a = 200;
		System.out.println("Print from a");
	}
	// Cannot make a static reference to the non-static
	int n = 100;  // compilation error

	// Cannot make a static reference to the non-static 
	// method a2() from the type Test
	a2();  // Compilition error

	System.out.println(super.j);  // compiler error

	// instance method
	void a2 {
		System.out.println("Inside a2");
	}
	public static void main(String[] args) {
		// main method
		Method md = new Method();
		md.a;
	}
}