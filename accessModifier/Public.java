class PublicClass {
	public int myMethod(int x) {
		return x;
	}
}

public class Public {
	public static void main(String[] args) {
		PublicClass obj = new PublicClass();
		System.out.println("The value of the method is " + obj.myMethod(10));
	}
}