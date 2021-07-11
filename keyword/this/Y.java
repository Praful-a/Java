public class Y {
	X obj;

	// Parameterized constructor with object of X of a parameter
	Y(X obj) {
		this.obj = obj;
		// calling display method of class X
		obj.display();
	}
}
class X {
	int x = 45;
	// Default Constructor that create a object of Y
	// with passing this as an argument in the constructor
	X() {
		Y obj = new Y(this);
	}
	// method to show value of x
	void display() {
		System.out.println("Value of x in Class Y : " + x);
	}
	public static void main(String[] args) {
		X obj = new X();
	}
}