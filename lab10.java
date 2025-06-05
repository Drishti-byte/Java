/*program to find maximum of two numbers using ternary operator*/
import java.util.*;
public class lab10 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
            System.out.println("The maximum number is "+max);
        }
    }
}