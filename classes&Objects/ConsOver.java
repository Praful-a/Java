class ConsOver {
	String name, course, technology;
	ConsOver(String s, String n) {
		name = s;
		course = n;
	}
	ConsOver(String s, String n, String c) {
		name = s;
		course = n;
		technology = c;
	}
	void show() {
		System.out.println(name + " " + course + " " + technology);
	}
	public static void main(String[] args) {
		ConsOver ob1 = new ConsOver("Edureka", "java");
		ConsOver ob2 = new ConsOver("Edureka", "J2EE", "Java");
		ob1.show();
		ob2.show();
	}
}