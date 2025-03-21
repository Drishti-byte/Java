/*program to print the sum of first n natural numbers*/
import java.util.*;
public class loops1 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int sum = 0;
            for(int i=1; i <= num;i++)
            {
                sum = sum + i;
            }
            System.out.println("Sum is " + sum);
        }
    }
}