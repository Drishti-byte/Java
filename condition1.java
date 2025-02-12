/*program to check whether the number is even or odd*/
import java.util.*;
public class condition1 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if(num % 2 == 0)
            {
                System.out.println("Number is even");
            }
            else 
            {
                System.out.println("\nNumber is odd");
            }
        }
    }
}