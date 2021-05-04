// Program to demonstrate function Currying
import java.util.function.Function;
/*
public class Currying {
	public static void main(String[] args) {
		
		// Using Java 8 Functions
		// to create lambda expressions for functions
		// and with this, applying Function Currying

		// Curried Function for Adding u & v
		Function<Integer, Function<Integer, Integer> >
		curryAdder = u -> v -> u + v;

		// Calling the curried functions

		// Calling Curried Function for Adding u & v
		System.out.println("Add 2, 3 :" + curryAdder.apply(2).apply(3));
	}
}*/

// Program to multiply two numbers using function currying
/*public class Currying 
{
	public static void main(String[] args) {
		
		// Curried Function for Multiplying u & v
		Function <Integer, Function<Integer, Integer> >
		curryMulti = u -> v -> u * v;

		// Calling Curried Function for Multiplying u & v
		System.out.println("Multiply 2, 3 :" + curryMulti.apply(2).apply(3));
	}
}*/

// Program to Adding three numbers using Function curried
/*public class Currying {
	public static void main(String[] args) {
		
		// Curried Function for Adding u & v & w
		Function <Integer, Function<Integer, Function<Integer, Integer> > >
		curryAdd = u -> v -> w -> u + v + w;

		// Calling curried Function to Add three numbers;
		System.out.println("Add of 2, 3, 8 :" + curryAdd.apply(2).apply(3).apply(8));
	}
}*/