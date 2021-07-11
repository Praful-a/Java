public class ConsChain {
	int j, n;

	// Default consructor
	ConsChain() {
		this(28, 01);
		System.out.println("Inside default constructor n"); 
	}

	// Parameterized constructor
	ConsChain(int j, int n) {
		this.j = j;
		this.n = n;
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String[] args) {
		ConsChain obj = new ConsChain();
	}
}