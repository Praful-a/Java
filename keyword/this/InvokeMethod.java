public class InvokeMethod {
	void display() {
		// calling function show() 
		this.show();
		System.out.println("Inside display function");
	}
	void show() {
		System.out.println("Inside show function");
	}
	public static void main(String[] args) {
		InvokeMethod j = new InvokeMethod();
		j.display();
	}
}