class Student {
	String name;
	int rollno;
	String gender;
	double height;
	int weight;
	public Student(String n, int rn, String gen, double h, int w) {
		name = n;
		rollno = rn;
		gender = gen;
		height = h;
		weight = w;
	}

	public void display() {
		System.out.println(" Name : " + name);
		System.out.println(" Rollno : " + rollno);
		System.out.println(" Gender : " + gender);
		System.out.println(" Height : " + height);
		System.out.println(" Weight : " + weight);
	}
}

class DefaultCons {
	public static void main(String[] args) {
		Student s = new Student("John", 12330091, "male", 6.7, 68);
		s.display();
	}
}