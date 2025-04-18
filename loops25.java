/*program to print even numbers in a range*/
import java.util.*;
public class loops25 {
    public static void main(String args[])
    {
        System.out.println("Enter two numbers:");
        try (Scanner  sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i;
            for(i = a; i <= b; i += 2)
            {
               System.out.println(i);
            }
        }
    }
}