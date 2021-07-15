class Bike {
	int speedlimit = 80;
}

class DataMember extends Bike {
	int speedlimit = 150;

	public static void main(String[] args) {
		Bike obj = new DataMember();
		System.out.println(obj.speedlimit);
	}
}