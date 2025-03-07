/*program to find the sum of two numbers using functions*/
import java.util.*;
public class functions1 {
    public static void add(int a, int b)
    {
        System.out.println("Sum is "+(a+b));
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
        }
    }
}