/*program to create classes circle,cylinder and cone*/
import java.util.*;
class circle 
{
    protected double r;
    Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter radius:");
        r = sc.nextDouble();
    }
    public void show()
    {
        System.out.println("Radius: "+r);
    }
    public void area()
    {
        double a;
        a = 3.14 * r * r;
        System.out.println("Area: "+a);
    }
}
class cylinder extends circle 
{
    protected double h;
    public void input()
    {
        super.input();
        System.out.println("Enter height:");
        h = sc.nextDouble();
    }
    public void show()
    {
        super.show();
        System.out.println("Height: "+h);
    }
    public void area()
    {
        double a;
        a = 2*3.14*r*(r+h);
        System.out.println("Area: "+a);
    }
}
class cone extends circle 
{
    protected double l;
    public void input()
    {
        super.input();
        System.out.println("Enter length:");
        l = sc.nextDouble();
    }
    public void show()
    {
        super.show();
        System.out.println("Length: "+l);
    }
}
public class inheritance2 {
    public static void main(String args[])
    {
        circle c = new circle();
        cylinder cy = new cylinder();
        cone co = new cone();
        c.input();
        c.show();
        c.area();
        cy.input();
        cy.show();
        cy.area();
        co.input();
        co.show();
    }
}