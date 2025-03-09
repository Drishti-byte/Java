/*program to find the factorial of a number using functions*/
import java.util.*;
public class functions3 {
    public static void factorial(int n)
    {
        int fact = 1;
        for(int i=n; i >= 1;i--)
        {
            fact *= i;
        }
        System.out.println("The factorial is "+fact);
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) 
        {
            int num = sc.nextInt();
            factorial(num);
        }
    }
}
