
class Manager {
	// static vairable salary
	public static double salary;
	public static String name = "Jonathan";
}

public class staticVar {
	public static void main(String[] args) {
		// accessing static variable wihtou object
		Manager.salary = 90000;
		System.out.println(Manager.name + "s avg salary : " + Manager.salary);
	}
}