/*program to use constructors and inheritance*/
import java.util.*;
class rectangle
{
    protected int l,b;
    Scanner sc = new Scanner(System.in);
    rectangle()
    {
        l = b = 1;
    }
    rectangle(int x,int y)
    {
        l = x;
        b = y;
    }
    public void input()
    {
        System.out.println("Enter length:");
        l = sc.nextInt();
        System.out.println("Enter breadth:");
        b = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
    }
    public void area()
    {
        System.out.println("Area: "+(l*b));
    }
}
class cuboid extends rectangle 
{
    private int h;
    cuboid()
    {
        super();
        h = 1;
    }
    cuboid(int x,int y,int z)
    {
        super(x,y);
        h = z;
    }
    public void input()
    {
        super.input();
        System.out.println("Enter height:");
        h = sc.nextInt();
    }
    public void show()
    {
        super.show();
        System.out.println("Height: "+h);
    }
    public void area()
    {
        int a;
        a = 2*(l*b+b*h+h+l);
        System.out.println("Area: "+a);
    }
}
public class inheritance1 {
    public static void main(String args[])
    {
        cuboid c = new cuboid();
        rectangle r = new rectangle();
        c.input();
        c.show();
        c.area();
        r.input();
        r.show();
        r.area();
    }
}