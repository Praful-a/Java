// Java program to illustrate Serializing
// an object.
import java.io.*;

// class DeserializationEx implements Serializable
// {
// 	private String name;
// 	DeserializationEx(String name)
// 	{
// 		this.name = name;
// 	}
// 	public static void main(String[] args)
// 	{
// 		try
// 		{
// 			DeserializationEx d = new DeserializationEx("GeeksForGeeks");
// 			FileOutputStream f = new FileOutputStream("file.txt");
// 			ObjectOutputStream oos = new ObjectOutputStream(f);
// 			oos.writeObject(d);
// 			oos.close();
// 			f.close();
// 		}
// 		catch (Exception e)
// 		{
// 			e.printStackTrace();
// 		}
// 	}
// }


public class DeserializationEx implements Deserializable
{
    public static void main(String[] args)
    {
        try
        {
            DeserializationEx d;
            FileInputStream f = new FileInputStream("file.txt");
            ObjectInputStream oos = new ObjectInputStream(f);
            d = (DeserializationEx)oos.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(d.name);
    }
}