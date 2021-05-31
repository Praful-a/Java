import java.util.*;
class EnterDetail {
	public static void main(String[] args) {
		String name;
		float height;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Your Name : ");
		name = sc.nextLine();
		System.out.print(" Enter Your Height : ");
		height = sc.nextFloat();
		System.out.print(" Enter Your Age : ");
		age = sc.nextInt();
		System.out.println("\n Name : " + name);
		System.out.println(" Height : " + height);
		System.out.println(" Age : " + age);
	}
}