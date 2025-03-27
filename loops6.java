/*program to print solid rectangle*/
import java.util.*;
public class loops6 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("How many rows are there:");
            int r = sc.nextInt();
            System.out.println("How many columns are there:");
            int c = sc.nextInt();
            for(int i=1; i <= r;i++)
            {
                for(int j=1; j <= c;j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}