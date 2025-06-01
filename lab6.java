/*program to input radius and print perimeter and area*/
import java.util.*;
public class lab6 {
    public static void main(String args[])
    {
        final float PI = 3.14f;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius of the circle:");
            int r  = sc.nextInt();
            int area = r * r;
            System.out.println("The area of circle is "+area);
            double perimeter = 2 * PI * r;
            System.out.println("The perimeter of circle is "+perimeter);
        }
    }
}