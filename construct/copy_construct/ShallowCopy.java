class Department {
	String empId;
	String grade;
	String designation;

	public Department(String empId, String grade, String designation) {
		this.empId = empId;
		this.grade = grade;
		this.designation = designation;
	}
}

class Employee implements Cloneable {
	int id;
	String name;
	Department dept;
	public Employee(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	// Default version of Clone() method. It creates a shallow copy 
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Department dept1 = new Department("1", "A", "AVP");
		Employee emp1 = new Employee(111, "John", dept1);
		Employee emp2 = null;

		try {
			// Creating a clone of emp1 and assigning it to emp2
			emp2 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(emp1.dept.designation);
		emp2.dept.designation = "Director";

		System.out.println(emp1.dept.designation);
	}
}