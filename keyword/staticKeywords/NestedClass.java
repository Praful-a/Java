public class NestedClass {
	private static String str = "Edureka";
	// Static class
	static class MyNestedClass {
		// non-static method
		public void disp() {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		NestedClass.MyNestedClass obj = new NestedClass.MyNestedClass();
		obj.disp();
	}
}