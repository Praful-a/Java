abstract class Person {
	private String name;
	private String gender;
	public Person(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}
	abstract void Studying();
	@Override
	public String toString() {
		return "Name=" + this.name + "::Gender=" + this.gender;
	}
}

public class Student extends Person {
	private int StudentId;
	public Student(String nm, String gen, int id) {
		super(nm, gen);
		this.StudentId = id;
	}
	@Override
	public void Studying() {
		if(StudentId == 0) {
			System.out.println("Not Studying");
		} else {
			System.out.println("Pursuing a Degree in Bechelor of Engineering");
		}
	}
	public static void main(String[] args) {
		Person student = new Student("Priya", "Female", 0);
        Person student1 = new Student("Karan", "Male", 201021);
        Person student2 = new Student("Kumari", "Female", 101021);
        Person student3 = new Student("John", "Male", 201661);
		student.Studying();
		student1.Studying();
		student2.Studying();
		student3.Studying();
		System.out.println(student.toString());
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString()); 	
	}
}