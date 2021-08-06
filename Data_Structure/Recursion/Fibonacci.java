import java.math.BigInteger;
import java.util.*;
/*class Fibonacci {
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		int res = fib(num);
		System.out.println("The series are : " + res);
	}
}*/

class Fibonacci {
	static BigInteger fib(int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j = 2; j <= n; j++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return (c);
	}
	public static void main(String[] args) {
		int n = 100;
		System.out.println("Fibonacci of " + n + "th term" + " " + "is" + " " + fib(n));
	}
}