/*program to print square and cube*/
import java.util.*;
public class lab {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int square = (a + b) * (a + b);
            System.out.println("The (a+b) ^ 2  is "+square);
            int cube = (a + b) * (a + b) * (a + b);
            System.out.println("The (a+b) ^ 3  is "+cube);
        }
    }
}