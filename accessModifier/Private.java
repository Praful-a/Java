/*class A {
	private void display() {
		System.out.println("Hello");
	}
}

class Private {
	public static void main(String[] args) {
		A obj = new A();
		obj.display();
	}
}*/

class Private {
	private void display() {
		System.out.println("Hello");
	} 
	public static void main(String[] args) {
		Private obj = new Private();
		obj.display();
	}
}