/*program to print floyd's triangle*/
import java.util.*;
public class loops14 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int k = 1;
            System.out.println("How many rows are there:");
            int r = sc.nextInt();
            for(int i=1; i <= r;i++)
            {
                for(int j=1; j <= i;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}