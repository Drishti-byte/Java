/*program to check whether the number is prime or not*/
import java.util.*;
public class loops5 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int count = 0;
            for(int i=2; i < num;i++)
            {
                if(num % i == 0)
                {
                    count++;
                }
            }
            if(count == 0)
            {
                System.out.println(num+" is prime");
            }
            else
            {
                System.out.println(num+" is not prime");
            }
        }
    }
}