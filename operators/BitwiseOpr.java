public class BitwiseOpr {
	public static void main(String[] args) {
		int a = 58;  // 111010
		int b = 13;  // 1101
		System.out.println(a&b);  // returns 8 = 100
		System.out.println(a|b); // 63 = 111111
		System.out.println(a^b); // 55 = 11011
		System.out.println(~a);  // -59
	}
}