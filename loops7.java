/*program to print hollow rectangle*/
import java.util.*;
public class loops7 {
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
                    if(i== 1 || j == 1 || i == r || j == c)
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