class ByteEx {
	static byte b;
	public static void main(String args[]) {
		byte n, a;
		n = 127;
		// a = 177;
		System.out.println(n);
		// throws an error because it cannot store more than 127 bits.
		// System.out.println(a); 
		// default value of byte
		System.out.println(b);
	}
}