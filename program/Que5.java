interface His {
	void u();
	void v();
}

interface Exam {
	void w();
	void x();
}

interface Labs {
	void y();
	void z();
}

interface Workup extends His, Exam, Labs {
	void zz();
}

abstract class Document {
	private int i = 0;
	abstract void doc();
}

class BB extends Document implements Workup {
	private int j = 0;
	public void u() {};
	public void v() {};
	public void w() {};
	public void x() {};
	public  void y() {};
	public void z() {};
	public void zz() {};
	public void doc() {};
}

public class Que5 {
	public static void m1(His history) {
		history.v();
	}
	public static void m2(Exam exam) {
		exam.w();
	}
	public static void m3(Labs labs) {
		labs.y();
	}
	public static void m4(Workup work) {
		work.zz();
	}
	public static void main(String[] args) {
		BB b = new BB();
		m1(b);
		m2(b);
		m3(b);
		m4(b);
	}
}