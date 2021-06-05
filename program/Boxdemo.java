class Overload {
	double area(float l, float w, float h) {
		return l*w*h;
	}

	double area(float l) {
		return l*l*l;
	}
}

public class Boxdemo {
	public static void main(String[] args) {
		Overload over = new Overload();
		double cube = over.area(5);
		System.out.println("Area of cube is : " + cube);
		System.out.println("");
		double rectangleBox = over.area(5,8,9);
		System.out.println("Area of rectangular box is : " + rectangleBox);
	}
}