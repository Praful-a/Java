abstract class Vehicle 
{
}

class Car extends Vehicle {
	public void run() {
		System.out.println("Car runs");
	}
}

abstract class Autom {
	abstract public void run();
}

class Bike extends Autom {
	public void run() {
		System.out.println("Bike runs");
	}
}

public class DownCast {
	public static void test1(Vehicle a6) {
		((Car)a6).run();
	} 
	public static void test2(Autom bmx) {
		bmx.run();
	}
	public static void main(String args[]) {
		Vehicle a6 = new Car();
		test1(a6);
		Autom bmx = new Bike();
		test2(bmx);
	}
}