// Java program to illustrate creation of Object 
// using new keyword
// public class NewKeyword
// {
// 	String name = "GeeksForGeeks";
// 	public static void main(String[] args)
// 	{
// 		//Here we are creating Object of
// 		//NewKeyword using new keyword
// 		NewKeyword obj = new NewKeyword();
// 		System.out.println(obj.name);
// 	}
// }

/************* Using new Instance ************/
public class NewInstance
{
	String name = "GeeksForGeeks";
	public static void main(String[] args)
	{
		try
		{
			class cls = Class.forName("NewInstance");
			NewInstance obj = (NewInstance) cls.NewInstance();
			System.out.println(obj.name);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		Catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}