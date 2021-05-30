/*
A virtual function for which we are not required implementation is considered
as pure virtual function. For example, Abstract method in Java is a pure
virtual function. Consider the below example:
*/

abstract class Animal {
	final void bark() {
		System.out.println("Dog");
	}
	abstract void jump(); // Abstract Method (Pure Virtual function)
}

class MyPet extends Animal {
	void jump() {
		System.out.println("MyPet is so sweet");
	}
}

public class PureVirtual {
	public static void main(String[] args) {
		Animal obj = new MyPet();
		obj.jump();
	}
}