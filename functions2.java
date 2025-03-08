/*program to multiply two numbers using functions*/
import java.util.*;
public class functions2 {
    public static void multiply(int a, int b)
    {
        int m = a * b;
        System.out.println("The product is "+m);
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            multiply(a,b);
        }
    }
}