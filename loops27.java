/*program to find sum of digits*/
import java.util.*;
public class loops30 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int i,d,sum= 0;
            for(i=0; i <= num;i++)
            {
                d = num % 10;
                sum = sum + d;
                num = num / 10;
            }
            System.out.println("The sum is "+sum);
        }
    }
}