// Program to illustrate using
// break to exit a  loop
/*class Jump
{
	public static void main(String args[]) {
		// Initially loop is set to run from 0-9
		for(int i=0; i<10; i++)
		{
			// terminate loop when i is 5.
			if(i == 5)
				break;

			System.out.println("i: "+i);
		}
		System.out.println("Loop complete.");
	}
}*/

// Program to illustrate using break with goto
/*class Jump
{
	public static void main(String args[])
	{
		boolean t = true;

		// label first
		first:
		{
			// Illegal statement here as label second is not
			// introduced yet break second;
			second:
			{
				third:
				{
					// Before break
					System.out.println("Before the break statement.");

					// break will take the control out of
					// second label
					if (t)
						break second;
					System.out.println("This won't execute.");
				}
				System.out.println("This won't execute.");
			}
			// First block
			System.out.println("This is after second block.");
		}
	}
}*/

// Program to illustrate using continue in an if statement
/*class Jump
{
	public static void main(String args[])
	{
		for(int i=0; i<10; i++)
		{
			// If the number is even
			// skip and continue
			if(i%2 == 0)
				continue;

			// If number is odd, print it
			System.out.println(i + " ");
		}
	}
}*/

// Program to illustrate using return
class Jump
{
	public static void main(String args[])
	{
		boolean t = true;
		System.out.println("Before the return.");
		if(t)
			return;

		// Compiler will bypass every statement
		// after return
		System.out.println("This won't execute.");
	}
}