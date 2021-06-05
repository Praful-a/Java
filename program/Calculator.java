package praful21;
class Arithmetic_Opr {

	int a;
	int b;
	Arithmetic_Opr(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void addition() {
		int z = a + b;
		System.out.println("The sum is : " + z);
	}
	public void subtraction() {
		int sub = a - b;
		System.out.println("The sub is : " + sub);
	}
	public void multiplication() {
		int mul = a * b;
		System.out.println("The mul is : " + mul);
	}
	public void divide() {
		int div = a / b;
		System.out.println("the divide is : " + div);
	}
}

public class Calculator extends Arithmetic_Opr {
	
	Calculator(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator(10, 2);
		c.addition();
		c.subtraction();
		c.multiplication();
		c.divide();
	}
}