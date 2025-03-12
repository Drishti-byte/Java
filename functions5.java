/*program to check whether the number is even or odd using functions*/
import java.util.*;
public class functions5 {
    public static void even(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println(n+" is even");
        }
        else 
        System.out.println(n+" is odd");
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) 
        {
            int num = sc.nextInt();
            even(num);
        }
    }
}