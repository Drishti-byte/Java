/*program to check whether the number is divisible by 5 and 7*/
import java.util.*;
public class lab9 {
    public static void main(String args[])
    {
        System.out.println("Enter your number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if(num % 5 == 0 && num % 7 == 0)
            System.out.println(num+" is divisible by both 5 and 7");
            else 
            System.out.println(num+" is not divisible by 5 and 7");
        }
    }
}