/*class Cons {
	
	// Default Constructor
	Cons() {
		System.out.println("hello learner");
	}
	public static void main(String[] args) {
		Cons obj = new Cons();
	}
}*/

class Cons {
	String name, course;
	// Parametrized Constructor
	Cons() {
		System.out.println("Default Constructor");
	}
	Cons(String s, String n) {
		name = s;
		course = n;
	}
	void show() {
		System.out.println(name + " " + course);
	}
	public static void main(String[] args) {
		Cons ob = new Cons();
		Cons obj = new Cons("Java", "J2EE");
		Cons obj2 = new Cons("Java", "Advanced Java");
		obj.show();
		obj2.show();
	}
}