public class Field {
	int j, n;
	// Parameterized constructor
	Field(int j, int n) {
		this.j = j;
		this.n = n;
	}

	void display() {
		// Displaying value of variables j and n
		System.out.println("j = " + j + " n = " + n);
	}
	public static void main(String[] args) {
		Field obj = new Field(20, 01);
		obj.display();
	}
}