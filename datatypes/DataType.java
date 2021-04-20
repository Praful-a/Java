/******* Boolean ******/
/*
class DataType {
	public static void main(String args[])
	{
		boolean b = true;
		if (b == true)
			System.out.println("Hi Geek");
	}
}		*/


/********* Byte **********/
/*
class DataType {
	public static void main(String args[]) {
		byte a = 126;

		// byte is 8 bit value
		System.out.println(a);
		
		a++;
		System.out.println(a);

		// It overflows here because 
		// byte code hold values from -128 to 127
		a++;
		System.out.println(a);

		// Looping back within the range
		a++;
		System.out.println(a);
	}
}		*/

class DataType {
	public static void main(String args[]) {

		//declaring character
		char a = 'G';
		int i = 89;

		byte b = 4;
		short s = 56;

		double d = 4.355453532;
		float f = 4.7333434f;
		System.out.println("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}