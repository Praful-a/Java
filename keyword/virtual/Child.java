/*
* Runtime polymorphism is a process in which a call to
an overridden method is resolved at runtime rather
than compile time.
* In runtime polymorphism, we will use the reference
variable to call a method instead of a reference variable.
* The virtual functions can be used to achieve
runtime polymorphism.
*/

class Base {
	public void show() // virtual function
	{
		System.out.println("Welcome to India!!");
	}
}

class Child extends Base {
	public void show() {
		System.out.println("Best Country for politics!!");
	}
	public static void main(String[] args) {
		Base obj = new Child();
		obj.show();
	}
}

