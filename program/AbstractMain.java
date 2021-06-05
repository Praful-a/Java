abstract class Base {

	Base() {
		this.print();
	}

	abstract void print();
}

class Derived extends Base {
	void print() {
		int num = 10;
		System.out.println("Derived class: " + num);
	}  
}

class AbstractMain {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.print();
	}
}