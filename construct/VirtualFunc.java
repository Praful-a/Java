class Parent {
	void v1() {
		System.out.println("Inside the Parent Class");
	}
}

public class VirtualFunc extends Parent {
	void v1() // Overriding function from the Parent class
	{
		System.out.println("Inside the Child Class");
	}
	public static void main(String[] args) {
		Parent ob1 = new VirtualFunc(); // Refering the child class object using the parent class
		ob1.v1(); 
	}
}