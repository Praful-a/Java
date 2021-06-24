public class EqualsIgnore {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "HELLO";
		String s3 = "hi";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}
}