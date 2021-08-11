final class BaseClass {
	void Display() {
		System.out.print("This is the Display() method of a BaseClass.");
	}
}
class DerivedClass extends BaseClass {
	void Display() {
		System.out.print("This is Display() method of a DerivedClass.");
	}
}
public class FinalClass {
	public static void main(String[] args) {
		DerivedClass d = new DerivedClass();
		d.Display();
	}
}