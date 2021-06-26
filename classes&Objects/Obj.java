public class Obj {
	public Obj() {
		// Default Constructor
		System.out.println("This is a default constructor.");
	}
	public Obj(String name) {
		// This constructor has one parameter
		System.out.println("Hello: " + name);
		System.out.println("Welcome to Java");
	}
	public static void main(String[] args) {
		Obj o = new Obj();
		Obj om = new Obj("Max");
	}
}