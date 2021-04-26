// Local Variable
/*public class Variable {
	public void StudentAge()
	{
		// local variable age
		int age = 0;
		age = age + 5;
		System.out.println("Student age is : " + age);
	}

	public static void main(String args[])
	{
		Variable obj = new Variable();
		obj.StudentAge();
	}
}*/

// Instance Variable
/*
import java.io.*;
class Marks {
	// These variables are instance variables.
	// These variables are in a class
	// and are not inside any function
	int engMarks;
	int mathMarks;
	int phyMarks;
}

class Variable {
	public static void main(String args[])
	{
		// first object
		Marks obj1 = new Marks();
		obj1.engMarks = 50;
		obj1.mathMarks = 80;
		obj1.phyMarks = 90;

		// second object
		Marks obj2 = new Marks();
		obj2.engMarks = 80;
		obj2.mathMarks = 60;
		obj2.phyMarks = 85;

		// displaying marks for first object
		System.out.println("Marks for first object:");
		System.out.println(obj1.engMarks);
		System.out.println(obj1.mathMarks);
		System.out.println(obj1.phyMarks);

		// displaying marks for second object
		System.out.println("Marks for second object:");
		System.out.println(obj2.engMarks);
		System.out.println(obj2.mathMarks);
		System.out.println(obj2.phyMarks);
	}
}*/


import java.io.*;
class Emp {
	// static variable salary
	public static double salary;
	public static String name = "Harsh";
}
public class Variable {
	public static void main(String args[])
	{
	 	// accessing static variable without object
	 	Emp.salary = 1000;
	 	System.out.println(Emp.name + "'s average salary:" + Emp.salary);
	}
}