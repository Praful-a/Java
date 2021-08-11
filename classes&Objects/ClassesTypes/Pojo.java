class PojoClass {
	private int value = 365;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

public class Pojo {
	public static void main(String[] args) {
		PojoClass p = new PojoClass();
		p.setValue(400); // changing the private value using setvalue method.
		System.out.println(p.getValue());
	}
}