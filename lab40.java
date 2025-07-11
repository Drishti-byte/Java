/*program to check whether a number is armstrong or not*/
import java.util.*;
public class lab40 {
    public static void main(String[] args) {
        int num,n,d,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        n = num;
        while(num != 0)
        {
            d = num % 10;
            num = num / 10;
            sum = sum + d * d * d;
        }
        if(sum == n)
        System.out.println(n+" is an armstrong number");
        else 
        System.out.println(n+" is not an armstrong number");
    }
}