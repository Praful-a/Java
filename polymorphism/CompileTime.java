class Calculator {
	int add(int x, int y) {
		return x + y;
	}
	int add(int x, int y, int z)
	{
		return x + y + z;
	}
}

public class CompileTime {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3, 4));
	}
}