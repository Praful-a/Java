public class Main {
	public void finalize() throws Throwable {
		System.out.println("Object is destroyed by the Garbage Collector");
	}
	public static void main(String[] args) {
		Main test = new Main();
		test = null;
		System.gc();
	}
}