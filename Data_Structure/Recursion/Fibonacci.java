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
		System.out.println("Fibonacci of " + num + "th term" + " " + "is" + " " + fib(num));
	}
}*/

/*class Fibonacci {
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
}*/

/* Using Recursion */
/*public class Fibonacci {
	static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		int res = fib(num);
		System.out.println("Fibonacci of " + num + "th term" + " " + "is" + " " + fib(num));
	}
} */

/* Using Memoization */
public class Fibonacci {
	static int F[] = new int[51];
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		if(F[n] != -1) {
			return F[n];
		}
		F[n] = fib(n-1) + fib(n-2);
		return F[n];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i=0; i<51; i++) {
			F[i] = -1;
		}
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		int res = fib(num);
		System.out.println("Fibonacci of " + num + "th term" + " " + "is" + " " + fib(num));
	}
}