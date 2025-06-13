/*program to create a class circle with radius as data field and methods accept,area,peri*/
import java.util.*;
class circle 
{
    private double r;
    Scanner sc = new Scanner(System.in);
    circle()
    {
        r = 10;
    }
    circle(double x)
    {
        r = x;
    }
    public void accept()
    {
        System.out.println("Enter radius of the circle:");
        r = sc.nextDouble();
    }
    public void area()
    {
        double a;
        a = 3.14*r*r;
        System.out.println("Area of circle: "+a);
    }
    public void circum()
    {
        double c;
        c = 2*3.14*r;
        System.out.println("Circumference of circle: "+c);
    }
}
public class lab16 {
    public static void main(String args[])
{
    circle c = new circle(12.5);
    c.accept();
    c.area();
    c.circum();
}
}