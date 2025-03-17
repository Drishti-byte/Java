/*program to print circumference and area of the circle using functions*/
import java.util.*;
public class functions10 {
    public static void circumference(double r)
    {
        double c;
        c = 2 * 3.14 * r;
        System.out.println("The circumference of circle is "+c);
    }
    public static void area(double r)
    {
        double area;
        area = 3.14 * r * r;
        System.out.println("The area of circle is "+area);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius:");
            double r;
            r = sc.nextDouble();
            circumference(r);
            area(r);
        }
    }
}