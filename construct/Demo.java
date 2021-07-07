/* Abstract method in java is a pure virtual function. */

abstract class Animal {
	final void bark() {
		System.out.println("Dog");
	}
	abstract void jump(); // Abstract method(Pure Virtual function)
}

class MyPet extends Animal {
	void jump() {
		System.out.println("MyPet is so sweet");
	}
}

public class Demo {
	public static void main(String args[]) {
		Animal ob1 = new MyPet();
		ob1.jump();
	}
}