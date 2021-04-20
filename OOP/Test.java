class Main {

	// class contents
	void show()
	{
		System.out.println("Test::show() called");
	}
}

public class Test {

	// Driver Code
	public static void main(String[] args)
	{
		// Test t;

		// Allocating memory using new() makes above program work.
		Test t = new Test();
		// Error here because t
		// is not initialized
		t.show(); // No error
	}
}