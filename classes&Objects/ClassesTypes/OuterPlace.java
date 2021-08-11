public class OuterPlace {
	void my_Method() {
		int num = 45;
		class MethodInner_place {
			public void print() {
				System.out.println("method for inner classes " + num);
			}
		}
		MethodInner_place inner = new MethodInner_place();
		inner.print();
	}
	public static void main(String args[]) {
		OuterPlace outer = new OuterPlace();
		outer.my_Method();
	}
}