/*program to find the sum of odd numbers from 1-n using functions*/
import java.util.*;
public class functions8 {
    public static void sum(int num)
    {
        int sum = 0;
        for(int i = 1;i <= num;i += 2)
        {
            sum += i;
        }
        System.out.println("The sum of odd numbers is "+sum);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            sum(num);
        }
    }
}