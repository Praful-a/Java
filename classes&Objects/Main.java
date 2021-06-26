public class Main{
    //Defining a no argument method
    public void show(){
        System.out.println("Welcome to Edureka's Tutorial");
    }
 
    //Defining a two argument method
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
 
    public static void main(String[] args) {
        //Initializing variables
        int var1 = 10;
        int var2 = 20;
 		Main m = new Main();
        System.out.println("Edureka Objects and Classes in Java");
 
        //Invoking methods
        m.show();
 		int res = m.add(var1, var2);
        System.out.println("Sum of given numbers is "+ res);
    }
}