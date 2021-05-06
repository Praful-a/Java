/*class Car
{
	int no;
	Car(int no) 
	{
		this.no = no;
	}
}

class SwapObj
{
	// To swap c1 and c2
	public static void swap(Car c1, Car c2)
	{
		int temp = c1.no;
		c1.no = c2.no;
		c2.no = temp;
	}
	public static void main(String[] args) {
		Car c1 = new Car(1);
		Car c2 = new Car(2);
		swap(c1, c2);
		System.out.println("c1.no = " + c1.no);
		System.out.println("c2.no = " + c2.no);
	}
}*/


// Program to demonstrate that simply swapping 
// object references doesn't work
/*
class Car
{
	int model, no;

	// Constructor
	Car(int model, int no)
	{
		this.model = model;
		this.no = no;
	}

	// Utility mehtod to print Car
	void print()
	{
		System.out.println("no = " + no + ", model = " + model);
	}
}


class SwapObj
{
	// swap() doesn't swap c1 and c2
	public static void swap(Car c1, Car c2)
	{
		Car temp = c1;
		c1 = c2;
		c2 = temp;
	}

	// Driver method
	public static void main(String[] args) {
		Car c1 = new Car(101, 1);
		Car c2 = new Car(202, 2);
		swap(c1, c2);
		c1.print();
		c2.print();
	}
}*/

// Program to demonstrate that we can use wrapper
// classes to swap to objects
class Car
{
	int model, no;

	// Constructor
	Car(int model, int no)
	{
		this.model = model;
		this.no = no;
	}

	// Utility method to print object details
	void print()
	{
		System.out.println("no = " + no + ", model = " + model);
	}

}

// A Wrapper over class that is used for swapping
class CarWrapper
{
	Car c;

	// Constructor
	CarWrapper(Car c) 
	{
		this.c = c;
	}
}

	// A Class that use Car and swaps objects of Car
	// using Car Wrapper
class SwapObj
{
	// This method swaps car objects in wrappers
	// cw1 and cw2
	public static void swap(CarWrapper cw1, CarWrapper cw2)
	{
		Car temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c = temp;
	}

	public static void main(String[] args) {
		Car c1 = new Car(101, 1);
		Car c2 = new Car(202, 2);
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		swap(cw1, cw2);
		cw1.c.print();
		cw2.c.print();
	}
}
