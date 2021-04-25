// Java program to demonstrate how values can 
// be assigned to enums.
enum TrafficSingnal
{
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

	// declaring private variable for getting values
	private String action;

	// getter method
	public String getAction()
	{
		return this.action;
	}
	// enum constructor - cannot be public or protected
	private TrafficSingnal(String action)
	{
		this.action = action;
	}
}

// Driver code
public class EnumExample
{
	public static void main(String args[])
	{
		// let's print name of each enum and there action
		// - Enum values() exmples
		TrafficSingnal[] signals = TrafficSingnal.values();

		for (TrafficSingnal signal : signals)
		{
			// use getter method to get the value
			System.out.println("name : " + signal.name() + " action: " + signal.getAction());
		}
	}
}