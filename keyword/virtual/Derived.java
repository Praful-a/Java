/*
By default, all the instance methods in Java are considered 
as the Virtual function except final, static, and 
private methods as these methods can be used to 
achieve polymorphism.*/

class Parent {
	void v1() {
		System.out.println("Inside the Parent Class");
	}
}

public class Derived extends Parent {
	void v1() // Overriding function from the Parent class
	{
		System.out.println("Inside the Child Class");
	}
	public static void main(String[] args) {
		Parent obj = new Derived(); // Refering the child class object using the parent class 
		obj.v1();
	}
}