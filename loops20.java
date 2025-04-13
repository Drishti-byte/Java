/*program to hollow rhombus*/
import java.util.*;
public class loops20 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("How many rows are there:");
            int n = sc.nextInt();
            for(int i=1; i <= n;i++)
            {
                for(int j=1; j <= n;j++)
                {
                   if(i == 1 || i == n || j == 1 || j == n)
                   { 
                      System.out.print("*");
                   }
                   else 
                   {
                       System.out.print(" ");
                   }
                }
                System.out.println();
            }
        }
    }
}