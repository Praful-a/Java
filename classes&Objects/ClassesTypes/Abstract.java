interface X {
	int product(int x, int y);
}

abstract class Product implements X {
	public int product(int x, int y) {
		return x * y;
	}
}

class Abstract extends Product {
	public static void main(String[] args) {
		Abstract obj = new Abstract();
		int p = obj.product(20, 10);
		System.out.println("Product: " + p);
	}
}