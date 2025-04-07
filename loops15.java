/*program to print 0-1 triangle*/
import java.util.*;
public class loops15 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("How many rows are there:");
            int r = sc.nextInt();
            for(int i=1; i <= r;i++)
            {
                for(int j=1; j <= i;j++)
                {
                    if((i + j) % 2 == 0)
                    {
                        System.out.print("1");
                    }
                    else 
                    {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }
}