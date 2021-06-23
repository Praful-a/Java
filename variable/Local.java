/*public class Local {
	public void EmployeeID() {
		// local virable ID
		int id = 0;
		id = id + 6;
		System.out.println("Employee ID : " + id);
	}
	public static void main(String[] args) {
		Local obj = new Local();
		obj.EmployeeID();
	}
}*/

public class Local {
	public void EmployeeId() {
		int id = 0;
		id = id + 6;
	}
	public static void main(String[] args) {
		// using local variable outside the scope
		System.out.println("Employee ID : " + id);
	}
}