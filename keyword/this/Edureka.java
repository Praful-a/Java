public class Edureka {
	int j, n;

	// Default Constructor
	Edureka() {
		j = 100;
		n = 200;
	}
	// Method that returns current class instance
	Edureka get() {
		return this;
	}

	// Displaying value of variables j and n
	void display() {
		System.out.println("j = " + j + " n = " + n);
	}
	public static void main(String[] args) {
		Edureka obj = new Edureka();
		obj.get().display();
	}
}