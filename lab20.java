/*program to create a class shape and overload area method()*/
import java.util.*;
class shape 
{
    private int l,b;
    Scanner sc = new Scanner(System.in);
    public void display()
    {
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
    }
    public void area()
    {
        int a;
        l = 1;
        b = 1;
        a = l*b;
        System.out.println("Area: "+a);
    }
    public void area(int x)
    {
        int a;
        l = x;
        a = x*1;
        System.out.println("Area: "+a);
    }
    public void area(int x,int y)
    {
        int a;
        l = x;
        b = y;
        a = x*y;
        System.out.println("Area: "+a);
    }
}
public class lab20 {
    public static void main(String args[])
    {
        shape s = new shape();
        s.area(1,1);
        s.display();
        s.area();
        s.display();
        s.area(10);
        s.display();
    }
}