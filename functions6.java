/*program to print the table of a number using functions*/
import java.util.*;
public class functions6 {
    public static void table(int n)
    {
        int p = 1;
        for(int i = 1; i <= 10;i++)
        {
            p = n * i;
            System.out.println(n+" X "+i+" = "+p);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            table(num);
        }
    }
}