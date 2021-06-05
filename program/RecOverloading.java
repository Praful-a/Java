class Rectangle {
	int length, breadth;
	public Rectangle(int x, int y) {
		length = x;
		breadth = y;
	}

	Rectangle(int x) {
		length = x;
		breadth = 10;
	}

	public float getData() {
		return (length * breadth);
	}
}

class RecOverloading {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(200, 700);
		Rectangle rect1 = new Rectangle(200);
		System.out.println(" Area of rectangle is : " + rect.getData());
		System.out.println(" Area of second rectangle is : " + rect.getData());
	}
}