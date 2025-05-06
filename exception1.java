/*program to implement try-catch and finally block*/
public class exception1 {
    public static void main(String[] args) 
    {
        int a[] = new int[5];
        System.out.println("Hello World");
        try 
        {
            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }
        finally 
        {
            System.out.println("The program ended");
        }
        System.out.println("Bye World");
    }
}