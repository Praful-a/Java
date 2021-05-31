import java.io.*;
import java.util.*;

class Bikers
{
	static float s1, s2, s3, s4, s5;
	static float avgSpeed;
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Speed of five Bike Racer");
		s1 = input.nextInt();
		s2 = input.nextInt();
		s3 = input.nextInt();
		s4 = input.nextInt();
		s5 = input.nextInt();
		avgSpeed = (s1+s2+s3+s4+s5)/5;
		if((float)s1 > avgSpeed)
			System.out.println("The Speed Qualifying Racer is : "+s1);
		else if((float)s2 > avgSpeed)
			System.out.println("The Speed Qualifying Racer is : "+s2);
		else if((float)s3 > avgSpeed)
			System.out.println("The Speed Qualifying Racer is : "+s3);
		else if((float)s4 > avgSpeed)
			System.out.println("The Speed Qualifying Racer is : "+s4);
		else if((float)s5 > avgSpeed)
			System.out.println("The Speed Qualifying Racer is : "+s5);
		else
			System.out.println("No One!");
	}
}