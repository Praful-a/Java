/*class Outer_place {
	int num;
	private class Inner_place {
		public void print() {
			System.out.println("It is an inner class.");
		}
	}
	void display_Inner() {
		Inner_place inner = new Inner_place();
		inner.print();
	}
}
public class InnerClass {
	public static void main(String args[]) {
		Outer_place outer = new Outer_place();
		outer.display_Inner();
	}
}*/

/** Accessing private members using Inner class
 * */

class Outer_place {
	private int num = 162;
	class Inner_place {
		public int getNum() {
			System.out.println("It is a getnum method of inner class:");
			return num;
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		Outer_place outer = new Outer_place();
		Outer_place.Inner_place inner = outer.new Inner_place();
		System.out.println(inner.getNum());
	}
}