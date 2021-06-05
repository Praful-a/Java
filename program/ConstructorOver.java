class ConstructorOver {
	int id;
	String name;
	int age;

	ConstructorOver(int i, String n) {
		id = i;
		name = n;
	}

	ConstructorOver(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String[] args) {
		ConstructorOver s1 = new ConstructorOver(111, "Karan");
		ConstructorOver s2 = new ConstructorOver(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}