// Java code to illustrate
// using label and break
// instead of goto

/*public class Label {
	public static void main(String[] args) {
		// label for outer loop
		outer:
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					if(j == 1)
						break outer;
					System.out.println(" value of j = " + j);
				}
			}// end of outer loop
	}// end of main()
} // end of class Label
*/

// using label and continue

/*class Label {
	public static void main(String[] args) {
		
		// label for outer loop
		outer:
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					if (j == 1)
						continue outer;
					System.out.println(" value of j = " + j);
				}
			}
	}
}*/

// Java code
/*public class Label {
	public static void main(String[] args) {
		boolean t = true;
		first: {
			second : {
				third : {
					System.out.println("Before the break");
					if(t) // break out of second block
						break second;
				}
					System.out.println("This won't execute");
			}
					System.out.println("This is after second block");
		}		
	}
}*/

public class Label {
	public static void main(String[] args) 
	{
		outer:
			for(int i = 0; i < 3; i++) // label
			{
				System.out.print("Pass " + i + ": ");
				for(int j = 0; j < 100; j++) {
					if (j == 10) {
						break outer; // Exit both loops
					}
					System.out.println(j + " ");
				}
				System.out.println("This will not be printed");
			}
			System.out.println("Loops Complete.");
	}
}
