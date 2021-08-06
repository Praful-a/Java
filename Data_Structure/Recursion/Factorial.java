import java.util.*;
class Factorial {
	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a no : ");
		int	num = in.nextInt();
		int res = fact(num);
		System.out.println("The factorial of " + num + " is : " + res);
	}
}