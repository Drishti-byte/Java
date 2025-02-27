/*program to create an array of strings*/
import java.util.*;
public class strings4 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n,i;
            System.out.println("How many students are there:");
            n = sc.nextInt();
            String names[] = new String[n];
            System.out.println("Enter the names:");
            for(i = 0;i < n;i++)
            {
                names[i] = sc.nextLine();
            }
            System.out.println("Students List:");
            for(i = 0;i < n;i++)
            {
                System.out.println(names[i]);
            }
        }
    }
}