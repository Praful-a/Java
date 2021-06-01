import java.util.*;

class Factorial {
	public static void main(String[] args) {
		int n, i, res = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = input.nextInt();
		for(i = n; i >= 1; i--) {
			res = res * i;
		}
		System.out.print("The factorial of "+ n + " is : "+ res);
	}
}