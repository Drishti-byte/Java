/*program to implement interface*/
import java.util.*;
interface Shape 
{
    double area();
    double perimeter();
}
class Circle implements Shape 
{
    private double r;
    public Circle(double r)
    {
        this.r = r;
    }
    public double area()
    {
        double a;
        a = Math.PI * r * r;
        System.out.println("Area of circle: "+a);
        return 0;
    }
    public double perimeter()
    {
        double p;
        p = 2 * Math.PI * r;
        System.out.println("Perimeter of circle: "+p);
        return 0;
    }
}
class Rectangle implements Shape 
{
    private double length;
    private double width;
    public Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    public double area()
    {
        double ar;
        ar = 2 + (length * width);
        System.out.println("Area of rectangle: "+ar);
        return 0;
    }
    public double perimeter()
    {
        double p;
        p = length * width;
        System.out.println("Perimeter of rectangle: "+p);
        return 0;
    }
}
class Square implements Shape 
{
    private double side;
    public Square(double side)
    {
        this.side = side;
    }
    public double area()
    {
        double ar;
        ar = side * side;
        System.out.println("Area of square: "+ar);
        return 0;
    }
    public double perimeter()
    {
        double per;
        per = 4 * side;
        System.out.println("Perimeter of square: "+per);
        return 0;
    }
}
public class lab58 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
        c.perimeter();
        Rectangle r = new Rectangle(10,5);
        r.area();
        r.perimeter();
        Square s = new Square(7);
        s.area();
        s.perimeter();
    }
}