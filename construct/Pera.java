class Pera {
	String name, course;
	Pera(String s, String n) {
		name = s;
		course = n;
	}
	void show() {
		System.out.println(name + " " + course);
	}
	public static void main(String[] args) {
		Pera obj1 = new Pera("Java", "J2EE");
		Pera obj2 = new Pera("Java", "Advance Java");
		obj1.show();
		obj2.show(); 
	}
}