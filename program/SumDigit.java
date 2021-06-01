import java.util.Scanner;
class SumDigit {
	public static void main(String[] args) {
		int m, rem, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		m = input.nextInt();
		while(m > 0) {
			rem = m % 10;
			sum = sum + rem;
			m = m / 10;
		}
		System.out.println(" Sum of Digits : " + sum);
	}
}