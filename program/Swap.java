class Swap {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(" .. Before swap ..");
		System.out.println(" a = " + a + " " + " b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(" .. After swap ..");
		System.out.println(" a = " + a + " " + " b = " + b);
	}
}