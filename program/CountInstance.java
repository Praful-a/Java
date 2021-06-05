class CountInstance {
	static int noOfObjects = 0;

	{
		noOfObjects += 1;
	}

	public CountInstance() 
	{
	}
	public CountInstance(int n) 
	{}
	public CountInstance(String s)
	{
	}
	public static void main(String[] args) {
		CountInstance t1 = new CountInstance();
		CountInstance t2 = new CountInstance(5);
		CountInstance t3 = new CountInstance("GFG");
		int n = CountInstance.noOfObjects;
		System.out.println("Object created are : " + n);
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}