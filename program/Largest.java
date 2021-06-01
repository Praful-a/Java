import java.util.*;
class Largest {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a = input.nextInt();
		System.out.print("Enter the second number : ");
		b = input.nextInt();
		System.out.print("Enter the third number : ");
		c = input.nextInt();
		if(a > b) {
			if(a > c) {
				System.out.println("\nThe largest number is : " + a);
			} else {
				System.out.println("\nThe largest number is : " + c);
			}
		} else {
			if(b > c) {
				System.out.println("\nThe largest number is : " + b);
			} else {
				System.out.println("\nThe largest number is : " + c);
			}
		}
	}
}