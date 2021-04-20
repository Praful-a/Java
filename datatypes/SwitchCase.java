import java.util.Scanner;

enum Day
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
	FRIDAY, SATURDAY;
}
public class SwitchCase
{
	Day day;
	public SwitchCase(Day day)
	{
		this.day = day;
	}

	public void dayIsLike()
	{
		switch (day)
		{
			case MONDAY:
				System.out.println("Monday are bad.");
				break;
			case FRIDAY:
				System.out.println("Fridays are better.");
				break;
			case SATURDAY:
				System.out.println("Weekends are best.");
				break;
			default:
				System.out.println("Midweek days are so-so.");
				break;
		}
	}

	// Driver Method
	public static void main(String[] args)
	{
		String str = "MONDAY";
		SwitchCase s1 = new SwitchCase(Day.valueOf(str));
		s1.dayIsLike();
	}
}	

