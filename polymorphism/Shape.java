class ShapeEx {
	void draw() {
		System.out.println("drawing..");
	}
}

class Rectangle extends ShapeEx{
	void draw() {
		System.out.println("drawing rectangle !!");
	}
}

class Triangle extends ShapeEx{
	void draw() {
		System.out.println("drawing triangle !!");
	}
}

class Square extends ShapeEx{
	void draw() {
		System.out.println("drawing square !!");
	}
}

class Shape {
	public static void main(String[] args) {
		ShapeEx s;
		s = new Rectangle();
		s.draw();
		s = new Triangle();
		s.draw();
		s = new Square();
		s.draw();
	}
}