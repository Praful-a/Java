/*********** Enum ***********/

// enum Color
// {
// 	RED, GREEN, BLUE;
// }

// outside the class
// public class Test {

// 	public static void main(String[] args)
// 	{
// 		Color c1 = Color.RED;
// 		System.out.println(c1);
// 	}
// }

// Inside the class

public class Test 
{
	enum Color
	{
		RED, GREEN, BLUE;
	}

	public static void main(String[] args)
	{
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}