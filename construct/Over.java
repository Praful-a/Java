class Over {
	String name, course, technology;
	Over(String s, String n) {
		name = s;
		course = n;
	}
	Over(String s, String n, String c) {
		name = s;
		course = n;
		technology = c;
	}
	void show() {
		System.out.println(name + " " + course + " " + technology);
	}
	public static void main(String[] args) {
		Over obj1 = new Over("Edureka", "Java");
		Over obj2 = new Over("Edureka", "J2EE", "Java");
		obj1.show();
		obj2.show();
	}
}