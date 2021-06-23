class Price {
	// Instance variables that are declared in a class
	int guitarPrice;
	int pianoPrice;
	int flutePrice;
}

public class Instance {
	public static void main(String[] args) {
		Price obj1 = new Price();
		obj1.guitarPrice = 10000;
		obj1.pianoPrice = 50000;
		obj1.flutePrice = 1000;

		// Second object
		Price obj2 = new Price();
		obj2.guitarPrice = 9000;
		obj2.pianoPrice = 4000;
		obj2.flutePrice = 2000;

		// displaying the price the first object
		System.out.println(" Price for first object : ");
		System.out.println(" Guitar : " + "$" + obj1.guitarPrice);
		System.out.println(" Piano : " + "$" + obj1.pianoPrice);
		System.out.println(" Flute : " + "$" + obj1.flutePrice);

		// displyaing the price for second object
		System.out.println(" Price for second objects : ");
		System.out.println(" Guitar : " + "$" + obj2.guitarPrice);
		System.out.println(" Piano : " + "$" + obj2.pianoPrice);
		System.out.println(" Flute : " + "$" + obj2.flutePrice);		
	}
}