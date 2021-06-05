class ConsChaining {

	ConsChaining() {
		this("Hello World !!");
		System.out.println("The Default Constructor");
	}

	ConsChaining(String s) {
		System.out.println("Second Constructor : " + s);
	}

	public static void main(String[] args) {
		new ConsChaining();
	}
}