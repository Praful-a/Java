/*All java interface as considered virtual functions, as they depend on the implementing
classes to provide the method implementation*/

interface Car {
	void print();
}

class BMW implements Car {
	public void print() {
		System.out.println("BMW X7");
	}
	public static void main(String args[]) {
		BMW obj = new BMW();
		obj.print();
	}
}