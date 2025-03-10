/*program to check whether a number is prime or not using functions*/
import java.util.*;
public class functions4 {
    public static void prime(int n)
    {
        int count = 0;
        for(int i=2; i < n;i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 0) 
        System.out.println(n+" is prime");
        else 
        System.out.println(n+" is not prime");
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            prime(num);
        }
    }
}