/*class TypeConversion
{
	public static void main(String[] args)
	{
		int i = 100;

		// automatic type conversion
		long l = i;

		// automatic type conversion
		float f = l;
		System.out.println("Int Value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+ f);
	}
}*/

// Program to illustrate explicit type conversion
/*class TypeConversion
{
	public static void main(String[] args)
	{
		double d= 100.04;

		// explicit type casting
		long l = (long)d;

		// explicit type casting
		int i = (int)l;
		System.out.println("Double value "+d);

		// fractional part lost
		System.out.println("Long value "+l);

		// fractional part lost
		System.out.println("Int value " + i);
	}
}*/

// Program to illustrate Conversion of int and double to byte
/*class TypeConversion
{
	public static void main(String args[])
	{
		byte b;
		int i = 257;
		double d = 323.142;

		//i%256
		b = (byte) i;
		System.out.println("i = "+ i + " b = " + b);
		System.out.println("\nConversion of double to byte.");

		//d%256
		b = (byte) d;
		System.out.println("d = " + d + " b= " + b);
	}
}*/

// Program to illustrate Type promotion in Expressions
/*class TypeConversion
{
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;

		// The Expression
		double result = (f * b) + (i / c) - (d * s);

		// Ressult after all the promostions are done
		System.out.println("result = " + result);
	}
}*/

// Program to illustrate type casting int to byte
class TypeConversion
{
	public static void main(String[] args) {
		byte b = 50;

		// type casting int to byte
		b = (byte)(b * 2);
		System.out.println(b);
	}
}