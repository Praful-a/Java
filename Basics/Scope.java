/*public class Scope
{
	static int x = 11;
	private int y = 33;
	public void method1(int x)
	{
		Scope t = new Scope();
		this.x = 22;
		y = 44;

		System.out.println("Scope.x: " + Scope.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}
	public static void main(String args[]) {
		Scope t = new Scope();
		t.method1(5);
	}
}*/

// Loop Variable Scope
/*public class Scope
{
	public static void main(String args[])
	{
		{
			// This variable x has scope within brackets
			int x = 10;
			System.out.println(x);
		}

		// Uncommenting below line would produce
		// error since variable x is out of scope

		// System.out.println(x):
	}
}*/

/*class Scope
{
	public static void main(String args[])
	{
		for(int x = 0; x < 4; x++) 
		{
			System.out.println(x);
		}
		// Will produce error
		System.out.println(x);
	}
}*/

/*class Scope
{
	public static void main(String args[])
	{
		int x;
		for(x = 0; x < 4; x++)
		{
			System.out.println(x);
		}
		System.out.println(x);
	}
}*/


// Exercise 1
/*class Scope
{
	public static void main(String args[])
	{
		{
			int x = 5;
			{
				int x = 10;
				System.out.println(x);
			}
		}
	}
}*/


class Scope
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int i = 20;
		System.out.println(i);
	}
}