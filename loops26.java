/*program to print hcf of two numbers*/
import java.util.*;
public class loops26 {
    public static void main(String args[])
    {
        System.out.println("Enter two numbers:");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rem;
            while(a % b != 0)
            {
                rem = a % b;
                a = b;
                b = rem;
            }
            System.out.println("The hcf is "+b);
        }
    }
}