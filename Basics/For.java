// Program to illustrate infinite loop
/*public class For
{
	public static void main(String[] args)
	{
		for( ; ; )
		{
			System.out.println("This is an infinite loop");
		}
	}
}*/

// Program to initializing multiple variables in 
// initialization block
public class For
{

	public static void main(String[] args)
	{
		int x = 2;
		for(long y=0, z = 4; x < 10 && y < 10; x++, y++)
		{
			System.out.println(y + " ");
		}
		System.out.println(x);
	}
}

