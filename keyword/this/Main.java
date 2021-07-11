/* This keyword can be used as a method parameter */

public class Main {
	int j, n;
	// Default constructor
	Main() {
		j = 100;
		n = 200;
	}
	// Method that receives 'this' keyword as parameter
	void display(Main obj) {
		System.out.println("j = " + j + " n = " + n);
	}
	// Method that returns current class instance
	void get() {
		display(this);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.get();
	}
}