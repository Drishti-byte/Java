/*program to print the factors of a number*/
import java.util.*;
public class loops24 {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int i;
            System.out.println("The factors of "+num+" are:");
            for(i=2; i < num;i++)
            {
                if(num % i == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
