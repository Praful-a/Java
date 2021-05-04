/*public class NullKeyword {
	public static void main(String[] args) throws java.lang.Exception
	{
		// compile-time error : can't find symbol 'NULL'
		//Object obj = NULL;

		// runs successfully
		Object obj1 = null;
	}
}*/

// Any reference variable in java has default value null.

/*public class NullKeyword
{
	private static Object obj;
	public static void main(String[] args) {
		// it will print null;
		System.out.println("Value of object obj is : " + obj);
	}
} */
/*
public class NullKeyword
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Integer i = null;
		Integer j = 10;

		//prints false
		System.out.println(i instanceof Integer);

		// Compiles successfully
		System.out.println(j instanceof Integer);
	}
}*/
/*
public class NullKeyword
{
	public static void main(String args[])
	{
		NullKeyword obj = null;
		obj.staticMethod();
		obj.nonStaticMethod();
	}
	private static void staticMethod()
	{
		// Can be called by null reference
		System.out.println("static method, can be called by null reference");
	}
	private void nonStaticMethod()
	{
		// Can not be called by null reference
		System.out.println(" Non-static method- ");
		System.out.println("cannot be called by null reference");
	}

}*/

public class NullKeyword
{
	public static void main(String args[])
	{

		// return true;
		System.out.println(null==null);

		// return false;
		System.out.println(null!=null);
	}
}