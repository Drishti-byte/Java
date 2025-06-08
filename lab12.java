/*program to calculate factorial of a number*/
import java.util.*;
public class lab12 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int fact = 1;
            for(int i = num;i >= 1;i--)
            {
                fact *= i;
            }
            System.out.println("The factorial is "+fact);
        }
    }
}