/*program to print butterfly pattern*/
import java.util.*;
public class loops16 {
    public static void main(String args[])
    {
        try(Scanner sc =new Scanner(System.in))
        {
            System.out.println("How many rows are there:");
            int n = sc.nextInt();
            for(int i=0; i < n;i++)
            {
                for(int j=1; j <= i;j++)
                {
                    System.out.print("*");
                }
                for(int j=1; j <= 2*(n-i);j++)
                {
                    System.out.print(" ");;
                }
                for(int j=1; j <= i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n; i >= 1;i--)
            {
                for(int j=1; j <= i;j++)
                {
                    System.out.print("*");
                }
                for(int j=1; j < 2*(n-i);j++)
                {
                    System.out.print(" ");
                }
                for(int j=1; j <= i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}