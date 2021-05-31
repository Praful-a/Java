// Instance Variable
class Variables {
	int height,
	weight;  // Instance Variables
	Variables(int h, int w) {
		this.height = h;
		this.weight = w;
	}
	static int var1 = 29;
	void run() {
		System.out.println(" Huff Puff");
	}
	void print() {
		System.out.println(" Now my weight is " + this.weight);
	}
	void localVar() {
		int local_j = 45;  // A local variable
		System.out.println(" Local Variable value is : " + local_j);
	}
	public static void main(String[] args) {
		Variables A = new Variables(170, 65);
		A.run();
		A.print();
		A.localVar();
		System.out.println(" Static Variable's value is : " + var1);
	}

}