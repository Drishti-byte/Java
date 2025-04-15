/*program to check whether a number is plaindrome or not*/
import java.util.*;
public class loops22 {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int rev = 0,d,a;
            a = num;
            while(num != 0)
            {
                d = num % 10;
                rev = rev * 10 + d;
                num = num / 10;
            }
            System.out.println("The reverse is "+rev);
            if(a == rev)
            {
                System.out.println(a+" is palindrome");
            }
            else 
            {
                System.out.println(a+" is not palindrome");
            }
        }
    }
}