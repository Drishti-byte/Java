/*program to overload atleast 4 constructors*/
import java.util.*;
class overload 
{
    private int l,b;
    Scanner sc = new Scanner(System.in);
    overload()
    {
        l = b = 1;
    }
    overload(int x)
    {
        l = x;
        b = 10;
    }
    overload(int x,int y)
    {
        l = x;
        b = y;
    }
    public void display()
    {
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
    }
}
public class lab19 {
    public static void main(String args[])
    {
        overload o1 = new overload(14,25);
        o1.display();
        overload o2 = new overload();
        o2.display();
        overload o3 = new overload(19);
        o3.display();
    }
}