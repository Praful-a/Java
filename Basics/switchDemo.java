// Program to illustrate switch-case
/*class switchDemo
{
	public static void main(String args[])
	{
		int i = 9;
		switch(i)
		{
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			default:
				System.out.println("i is greater than 2.");
		}
	}
}*/


// Java program to demonstrate switch case
// with primitive(int) data type
/*public class switchDemo {
	public static void main(String[] args)
	{
		int day = 1;
		String dayString;

		switch(day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
			case 5:
				dayString = "Friday";
				break;
			case 6:
				dayString = "Saturday";
				break;
			case 7:
				dayString = "Sunday";
				break;
			default:
				dayString = "Invalid day";
		
		}
		System.out.println(dayString);

	}
}*/
/*
public class switchDemo {
	public static void main(String[] args)
	{
		int day = 7;
		String dayType;
		String dayString;

		switch(day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
			case 5:
				dayString = "Friday";
				break;
			case 6:
				dayString = "Saturday";
				break;
			case 7:
				dayString = "Sunday";
				break;
			default:
				dayString = "Invalid day";
		
		}
		switch(day) {
			// multiple cases without break statements

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				dayType = "Weekday";
				break;
			case 6:
			case 7:
				dayType = "Weekend";
				break;
			default:
				dayType = "Invalid daytype";
		}
		System.out.println(dayString + " is a "+ dayType);
	}
}*/

// Program to demonstrate
// nexted switch case statement

public class switchDemo {
	public static void main(String args[])
	{
		String Branch = "CSE";
		int year = 2;
		switch(year) {
			case 1:
				System.out.println("elective courses : Advance english, Algebra");
				break;
			case 2:
				switch(Branch) // nested switch
				{
					case "CSE":
					case "CCE":
						System.out.println("elective courses : Machine Learning, Big Data");
						break;
					case "ECE":
						System.out.println("elective courses: Antenna Engineering");
						break;
					default:
						System.out.println("Elective courses: Optimization");
				}
		}
	}
}