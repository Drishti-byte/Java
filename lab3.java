/*program to swap two numbers using third variable*/
import java.util.*;
public class lab3 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The numbers before swapping are :"+a+" "+b);
            int c;
            c = a;
            a = b;
            b = c;
            System.out.println("The numbers after swapping are :"+a+" "+b);
        }
    }
}